package cl.awakelab.sprintM7.model.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name="mesa")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="Numero")
    private int numero;
    @Column(name="Capacidad")
    private int capacidad;
    @Column(name="Ubicacion")
    private String ubicacion;

    public Mesa() {
    }

    public Mesa(int id, int numero, int capacidad, String ubicacion) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
