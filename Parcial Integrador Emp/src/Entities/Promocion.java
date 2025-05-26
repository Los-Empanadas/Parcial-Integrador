package Entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

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
    private Set<Articulo> articulos;
    private Imagen imagen;

    public Promocion() {
        this.articulos = new HashSet<>();
    }
    public Promocion(Long id, String denominacion, String descripcionDescuento, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, Double precioPromocional, TipoPromocion tipoPromocion) {
        super(id);
        this.denominacion = denominacion;
        this.descripcionDescuento = descripcionDescuento;
        this.FechaDesde = fechaDesde;
        this.FechaHasta = fechaHasta;
        this.HoraDesde = horaDesde;
        this.HoraHasta = horaHasta;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.articulos = new HashSet<>();
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public LocalDate getFechaDesde() {
        return FechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        FechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return FechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        FechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return HoraDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        HoraDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return HoraHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        HoraHasta = horaHasta;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(Double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo) {
        this.articulos.remove(articulo);
    }
}
