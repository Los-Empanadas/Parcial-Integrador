package Entities;

import java.util.HashSet;
import java.util.Set;

public class Categoria extends Base {
    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> subcategorias;

    public Categoria() {
        this.subcategorias = new HashSet<>();
    }

    public Categoria(Long id, Categoria categoriaPadre, String denominacion) {
        super(id);
        this.categoriaPadre = categoriaPadre;
        this.denominacion = denominacion;
        this.subcategorias = new HashSet<>();
    }

    public Categoria(Long id, String denominacion) {
        super(id);
        this.denominacion = denominacion;
        this.subcategorias = new HashSet<>();
    }
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }
    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

}
