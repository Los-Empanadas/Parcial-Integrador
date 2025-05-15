import Entities.*;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Pais Argentina = new Pais("Argentina");
        Provincia Mendoza = new Provincia("Mendoza", Argentina);
        Localidad Dorrego = new Localidad("Dorrego", Mendoza);
        Domicilio domicilioTapera = new Domicilio("Remedios de Escalada", 1766, 12345, Dorrego);

        Sucursal Tapera1 = new Sucursal("", domicilioTapera, LocalTime.of(11,30), LocalTime.of(23,30));
        Empresa LaTapera = new Empresa("La Tapera Restaurant", "Venta de comida", 1233444555);


    }
}