package cl.awakelab.sprintM7.model.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="camarero")
public class Camarero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Edad")
    private int edad;
    @Column(name="Fecha_Inicio")
    private Date fechaInicio;

    public Camarero() {
    }

    public Camarero(int id, String nombre, int edad, Date fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaInicio = fechaInicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
