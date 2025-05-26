package Entities;

import java.util.HashSet;
import java.util.Set;

public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private boolean esParaElaborar;
    private Set<ArticuloManufacturado> detalles;

    public ArticuloInsumo(Long id,String denominacion,double precioVenta,double precioCompra, Integer stockActual, Integer stockMaximo, boolean esParaElaborar) {
        super(id, denominacion, precioVenta);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
        this.detalles = new HashSet<>();
    }

    public Set<ArticuloManufacturado> getArticuloManufacturadoDetalle() {
        return detalles;
    }

    public void setArticuloManufacturadoDetalle(Set<ArticuloManufacturado> articuloManufacturadoDetalle) {
                this.detalles = articuloManufacturadoDetalle;
    }

    public void addArticuloManufacturadoDetalle(ArticuloManufacturado articuloManufacturadoDetalle) {
        this.detalles.add(articuloManufacturadoDetalle);
    }
    public void removeArticuloManufacturadoDetalle(ArticuloManufacturado articuloManufacturadoDetalle) {
        this.detalles.remove(articuloManufacturadoDetalle);
    }

    public boolean isEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }
}
