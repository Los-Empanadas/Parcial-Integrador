package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import Enums.*;

@Getter
@Setter
@ToString
@SuperBuilder
public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Articulo> articulos;
    private Imagen imagen;

    public Promocion() {
        this.articulos = new HashSet<>();
    }

    public Promocion(Long id, String denominacion, String descripcionDescuento,
                     LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde,
                     LocalTime horaHasta, Double precioPromocional, TipoPromocion tipoPromocion) {
        super(id);
        this.denominacion = denominacion;
        this.descripcionDescuento = descripcionDescuento;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.articulos = new HashSet<>();
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo) {
        this.articulos.remove(articulo);
    }
}