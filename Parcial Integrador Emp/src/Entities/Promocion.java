package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
import Enums.*;

public class Promocion extends Base {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

}
