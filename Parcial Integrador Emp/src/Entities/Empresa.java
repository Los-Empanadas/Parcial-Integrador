package Entities;

import java.util.ArrayList;

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuit;
    private ArrayList<Sucursal> sucursales;

    public Empresa(String nombre, String razonSocial, Integer cuit) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.sucursales = new ArrayList<>();
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
    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void añadirSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }
    public void eliminarSucursal(Sucursal sucursal) {
        this.sucursales.remove(sucursal);
    }
}
