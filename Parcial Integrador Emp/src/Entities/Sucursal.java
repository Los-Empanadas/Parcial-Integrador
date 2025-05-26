package Entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal extends Base {
    private String nombre;
    private Empresa empresa;
    private Domicilio domicilio;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Set<Categoria> categorias;
    private Set<Promocion> promociones;
    private Set<Pedido> pedidos;

    public Sucursal() {
        this.categorias = new HashSet<>();
        this.promociones = new HashSet<>();
        this.pedidos = new HashSet<>();
    }
    public Sucursal(String nombre,  LocalTime horarioApertura, LocalTime horarioCierre) {
        super();
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.categorias = new HashSet<>();
        this.promociones = new HashSet<>();
        this.pedidos = new HashSet<>();
    }

    public HashSet<Categoria> getCategorias() {
        return (HashSet<Categoria>) categorias;
    }

    public void setCategorias(HashSet<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Promocion> getPromociones() {
        return (HashSet<Promocion>) promociones;
    }

    public void setPromociones(HashSet<Promocion> promociones) {
        this.promociones = promociones;
    }
    public HashSet<Pedido> getPedidos() {
        return (HashSet<Pedido>) pedidos;
    }
    public void setPedidos(HashSet<Pedido> pedidos) {
        this.pedidos = pedidos;
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
    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
    public void removePedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

}
