package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class Sucursal extends Base {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    public Sucursal() {
        this.categorias = new HashSet<>();
        this.promociones = new HashSet<>();
        this.pedidos = new HashSet<>();
    }

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre,Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
        this.categorias = new HashSet<>();
        this.promociones = new HashSet<>();
        this.pedidos = new HashSet<>();
    }

    public void addCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public void addPromocion(Promocion promocion) {
        this.promociones.add(promocion);
    }

    public void removeCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }

    public void removePromocion(Promocion promocion) {
        this.promociones.remove(promocion);
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }
}