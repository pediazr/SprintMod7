package cl.awakelab.sprintM7.model.persistence.entity;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.MesaDTO;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="plato")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @ManyToOne
    @JoinColumn(name="Mesa_ID", insertable = true, updatable = false)
    private Mesa mesa;
    @ManyToOne
    @JoinColumn(name="Camarero_ID", insertable = true, updatable = false)
    private Camarero camarero;
    @Column(name="Fecha")
    private Date fecha;
    @Column(name="Total")
    private double total;

    public Pedido() {
    }

    public Pedido(int id, Mesa mesa, Camarero camarero, Date fecha, double total) {
        this.id = id;
        this.mesa = mesa;
        this.camarero = camarero;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
