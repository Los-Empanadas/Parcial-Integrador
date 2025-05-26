package Entities;

public class UnidadMedida extends Base{
    private String denominacion;
    public UnidadMedida(){}
    public UnidadMedida(Long id, String denominacion) {
        super(id);
        this.denominacion = denominacion;
    }
}
