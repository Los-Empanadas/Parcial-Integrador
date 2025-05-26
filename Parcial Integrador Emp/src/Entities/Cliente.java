package Entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente extends Base {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Usuario usuario;
    private Set<Pedido> pedidos;
    private Imagen imagen;

    public Cliente() {

    }

    public Cliente(Long id, String apellido, String email, LocalDate fechaNacimiento, String nombre, String telefono) {
        super(id);
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.pedidos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Set<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public Imagen getImagen() {
        return imagen;
    }
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
    public void removePedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

}
