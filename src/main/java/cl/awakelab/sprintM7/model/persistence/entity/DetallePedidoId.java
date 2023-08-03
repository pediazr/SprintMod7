package cl.awakelab.sprintM7.model.persistence.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetallePedidoId implements Serializable {
    @Column(name = "Pedido_ID")
    private Integer pedidoId;

    @Column(name = "Plato_ID")
    private Integer platoId;

    public DetallePedidoId() {
    }

    public DetallePedidoId(Integer pedidoId, Integer platoId) {
        this.pedidoId = pedidoId;
        this.platoId = platoId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getPlatoId() {
        return platoId;
    }

    public void setPlatoId(Integer platoId) {
        this.platoId = platoId;
    }
}
