import Entities.*;
import Entities.DAOs.*;
import Enums.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/parcial_prog";
        String usuario = "root";
        String clave = "";

        try (Connection conexion = DriverManager.getConnection(url, usuario, clave)) {
            System.out.println("✅ ¡Conexión exitosa!");

            // Creación de objetos con Builder
            Pais argentina = Pais.builder()
                    .nombre("Argentina")
                    .build();

            Provincia mendoza = Provincia.builder()
                    .nombre("Mendoza")
                    .pais(argentina)
                    .build();

            Localidad dorrego = Localidad.builder()
                    .nombre("Dorrego")
                    .provincia(mendoza)
                    .build();

            Domicilio domicilio = Domicilio.builder()
                    .calle("Remedios de Escalada")
                    .numero(1766)
                    .cp(12345)
                    .localidad(dorrego)
                    .build();


            Empresa laTapera = Empresa.builder()
                    .nombre("La Tapera")
                    .razonSocial("Venta de comida")
                    .cuil(1233444555)
                    .build();

            Sucursal tapera1 = Sucursal.builder()
                    .nombre("Sucursal Principal")
                    .horarioApertura(LocalTime.of(11, 30))
                    .horarioCierre(LocalTime.of(23, 30))
                    .domicilio(domicilio)
                    .build();

            laTapera.añadirSucursal(tapera1);
            tapera1.setEmpresa(laTapera);

            // Creación de categorías
            Categoria categoriaPrincipal = Categoria.builder()
                    .denominacion("Comidas")
                    .build();

            // Creación de unidad de medida
            UnidadMedida unidad = UnidadMedida.builder()
                    .denominacion("Unidad")
                    .build();

            // Creación de artículos
            ArticuloInsumo harina = ArticuloInsumo.builder()
                    .denominacion("Harina")
                    .precioVenta(150.0)
                    .precioCompra(100.0)
                    .stockActual(50)
                    .stockMaximo(200)
                    .esParaElaborar(true)
                    .unidadMedida(unidad)
                    .categoria(categoriaPrincipal)
                    .build();

            ArticuloManufacturado pizza = ArticuloManufacturado.builder()
                    .denominacion("Pizza")
                    .precioVenta(1200.0)
                    .descripcion("Pizza familiar")
                    .preparacion("Preparación de pizza")
                    .tiempoEstimadoMinutos(30)
                    .unidadMedida(unidad)
                    .categoria(categoriaPrincipal)
                    .build();

            // Creación de promoción
            Set<Articulo> articulosPromo = new HashSet<>();
            articulosPromo.add(pizza);

            Promocion promoHappyHour = Promocion.builder()
                    .denominacion("Happy Hour")
                    .descripcionDescuento("2x1 en pizzas")
                    .fechaDesde(LocalDate.now())
                    .fechaHasta(LocalDate.now().plusDays(7))
                    .horaDesde(LocalTime.of(18, 0))
                    .horaHasta(LocalTime.of(20, 0))
                    .precioPromocional(1200.0)
                    .tipoPromocion(TipoPromocion.happyHour)
                    .articulos(articulosPromo)
                    .build();

            tapera1.addPromocion(promoHappyHour);


            // Creación de cliente
            Cliente cliente = Cliente.builder()
                    .nombre("Franco")
                    .apellido("Mastantuono")
                    .email("nuevedoce@example.com")
                    .telefono("2611234567")
                    .fechaNacimiento(LocalDate.of(1990, 1, 1))
                    .build();
            //Creación de Usuario
            Usuario usuario1 = Usuario.builder()
                    .auth0Id("1")
                    .username("Mastan777")
                    .build();
            cliente.setUsuario(usuario1);

            // Creación de pedido
            Set<DetallePedido> detallesPedido = new HashSet<>();
            detallesPedido.add(DetallePedido.builder()
                    .cantidad(2)
                    .subTotal(2400.0)
                    .articulo(pizza)
                    .build());

            Pedido pedido = Pedido.builder()
                    .total(2400.0)
                    .totalCosto(2000.0)
                    .estado(Estado.preparacion)
                    .tipoEnvio(TipoEnvio.delivery)
                    .formaPago(FormaPago.efectivo)
                    .fechaPedido(LocalDate.now())
                    .horaEstimadaFinalizacion(LocalTime.now().plusMinutes(45))
                    .detalles(detallesPedido)
                    .cliente(cliente)
                    .sucursal(tapera1)
                    .build();


            // Creación de factura
            Factura factura = Factura.builder()
                    .fechaFacturacion(LocalDate.now())
                    .formaPago(FormaPago.efectivo)
                    .totalVenta(2400.0)
                    .pedido(pedido)
                    .build();

            System.out.println("🟢 Datos creados con éxito:");
            System.out.println(laTapera);
            System.out.println(tapera1);
            System.out.println(pizza);
            System.out.println(promoHappyHour);
            System.out.println(cliente);
            System.out.println(pedido);
            System.out.println(factura);

            // Aquí iría la lógica para guardar en la base de datos
            // usando DAOs similares a los del ejemplo
            EmpresaDAO empresaDAO = new EmpresaDAO();
            empresaDAO.save(conexion, laTapera);

        } catch (SQLException e) {
            System.out.println("🔴 Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }
}