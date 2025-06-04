package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import Enums.*;

@Getter
@Setter
@ToString
@SuperBuilder
public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Set<DetallePedido> detalles;
    private Sucursal sucursal;
    private Cliente cliente;

    public Pedido() {
        this.detalles = new HashSet<>();
    }

    public Pedido(Long id, Estado estado, LocalDate fechaPedido, FormaPago formaPago,
                  LocalTime horaEstimadaFinalizacion, TipoEnvio tipoEnvio,
                  double total, double totalCosto,Cliente cliente) {
        super(id);
        this.estado = estado;
        this.fechaPedido = fechaPedido;
        this.formaPago = formaPago;
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.tipoEnvio = tipoEnvio;
        this.total = total;
        this.totalCosto = totalCosto;
        this.detalles = new HashSet<>();
        this.cliente = cliente;
    }
}