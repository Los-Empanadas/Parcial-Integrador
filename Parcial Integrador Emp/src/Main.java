import Entities.*;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Pais Argentina = new Pais("Argentina");
        Provincia Mendoza = new Provincia("Mendoza");
        Mendoza.setPais(Argentina);
        Localidad Dorrego = new Localidad("Dorrego");
        Dorrego.setProvincia(Mendoza);
        Domicilio remediosDeEscalada1766 = new Domicilio("Remedios de Escalada", 1766, 12345);
        remediosDeEscalada1766.setLocalidad(Dorrego);

        Empresa LaTapera = new Empresa("La Tapera Restaurant", "Venta de comida", 1233444555);
        Sucursal Tapera1 = new Sucursal("", LocalTime.of(11,30), LocalTime.of(23,30));
        Tapera1.setEmpresa(LaTapera);
        Tapera1.setDomicilio(remediosDeEscalada1766);
        LaTapera.añadirSucursal(Tapera1);


    }
}