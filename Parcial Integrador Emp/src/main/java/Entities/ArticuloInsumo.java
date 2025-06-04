package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private boolean esParaElaborar;
    private Set<ArticuloManufacturado> detalles;

    public ArticuloInsumo(Long id, String denominacion, double precioVenta, double precioCompra,
                          Integer stockActual, Integer stockMaximo, boolean esParaElaborar) {
        super(id, denominacion, precioVenta);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
        this.detalles = new HashSet<>();
    }

    public void addArticuloManufacturadoDetalle(ArticuloManufacturado articuloManufacturadoDetalle) {
        this.detalles.add(articuloManufacturadoDetalle);
    }

    public void removeArticuloManufacturadoDetalle(ArticuloManufacturado articuloManufacturadoDetalle) {
        this.detalles.remove(articuloManufacturadoDetalle);
    }
}