package Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import Enums.*;

@Getter
@Setter
@ToString
@SuperBuilder
public class Factura extends Base {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;
    private Pedido pedido;

    public Factura(Long id, LocalDate fechaFacturacion, Integer mpPaymentId, Integer mpMerchantOrderId,
                   String mpPreferenceId, String mpPaymentType, FormaPago formaPago,
                   Double totalVenta, Pedido pedido) {
        super(id);
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
        this.pedido = pedido;
    }
}