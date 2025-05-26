package Entities;

import java.util.Set;

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles;

    public ArticuloManufacturado(Long id,String denominacion, Double precioVenta, String descripcion, String preparacion, Integer tiempoEstimadoMinutos) {
        super(id,denominacion, precioVenta);
        this.descripcion = descripcion;
        this.preparacion = preparacion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<ArticuloManufacturadoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<ArticuloManufacturadoDetalle> detalles) {
        this.detalles = detalles;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }
    public void addArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        this.detalles.add(articuloManufacturadoDetalle);
    }
    public void removeArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        this.detalles.remove(articuloManufacturadoDetalle);
    }
}
