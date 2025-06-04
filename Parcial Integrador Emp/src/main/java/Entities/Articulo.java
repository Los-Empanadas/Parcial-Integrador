package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public abstract class Articulo extends Base {
    protected String denominacion;
    protected Double precioVenta;
    private UnidadMedida unidadMedida;
    private Categoria categoria;
    private Imagen imagen;

    public Articulo(Long id, String denominacion, Double precioVenta) {
        super(id);
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }
}