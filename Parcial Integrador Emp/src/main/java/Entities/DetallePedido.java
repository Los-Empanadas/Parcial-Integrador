package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    public DetallePedido(Integer cantidad, Double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }
}