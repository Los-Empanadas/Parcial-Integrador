package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles;

    public ArticuloManufacturado(Long id, String denominacion, Double precioVenta,
                                 String descripcion, String preparacion, Integer tiempoEstimadoMinutos) {
        super(id, denominacion, precioVenta);
        this.descripcion = descripcion;
        this.preparacion = preparacion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public void addArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        this.detalles.add(articuloManufacturadoDetalle);
    }

    public void removeArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        this.detalles.remove(articuloManufacturadoDetalle);
    }
}