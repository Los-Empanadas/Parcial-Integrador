package Entities;

import java.util.HashSet;
import java.util.Set;

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuit;
    private Set<Sucursal> sucursales;

    public Empresa() {
        this.sucursales = new HashSet<>();
    }
    public Empresa(String nombre, String razonSocial, Integer cuit) {
        super();
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.sucursales = new HashSet<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public Integer getCuit() {
        return cuit;
    }
    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }
    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void añadirSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }
    public void eliminarSucursal(Sucursal sucursal) {
        this.sucursales.remove(sucursal);
    }
}
