package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@SuperBuilder
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
}