package Entities;

import java.time.LocalTime;
import java.util.ArrayList;

public class Sucursal extends Base {
    private String nombre;
    private Domicilio domicilio;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private ArrayList<Categoria> categorias;
    private ArrayList<Promocion> promociones;

    public Sucursal(String nombre, Domicilio domicilio, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.categorias = new ArrayList<>();
        this.promociones = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }
    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void addCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }
    public void addPromocion(Promocion promocion) {
        this.promociones.add(promocion);
    }
    public void removeCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }
    public void removePromocion(Promocion promocion) {
        this.promociones.remove(promocion);
    }
}
