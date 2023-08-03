package cl.awakelab.sprintM7.model.persistence.entity;

import cl.awakelab.sprintM7.model.persistence.repository.DetallePedidoId;
import jakarta.persistence.*;

@Entity
@Table(name="detalle_pedido")
public class DetallePedido {
    @EmbeddedId
    private DetallePedidoId id;
    @ManyToOne
    @JoinColumn(name="Pedido_ID", insertable = false, updatable = false)
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name="Plato_ID", insertable = false, updatable = false)
    private Plato plato;
    @Column(name="Cantidad")
    private int cantidad;
    @Column(name="Subtotal")
    private double subtotal;

    public DetallePedido() {
    }

    public DetallePedido(DetallePedidoId id, Pedido pedido, Plato plato, int cantidad, double subtotal) {
        this.id = id;
        this.pedido = pedido;
        this.plato = plato;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public DetallePedidoId getId() {
        return id;
    }

    public void setId(DetallePedidoId id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
