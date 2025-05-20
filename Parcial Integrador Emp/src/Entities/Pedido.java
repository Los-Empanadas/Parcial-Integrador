package Entities;

import Enums.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;


public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Set<DetallePedido> detalles;


}
