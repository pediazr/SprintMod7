package cl.awakelab.sprintM7.actividad2.model;

import cl.awakelab.sprintM7.actividad2.inter.CalculoDescuento;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> cantidades = List.of(3, 5, 4, 6, 9); // Cantidades de platos

        int capacidadMesa = 7; // Capacidad de la mesa

        CalculoDescuento calculoCantidad = new CalculoCantidad();
        double descuentoCantidad = calculoCantidad.descuento(cantidades, capacidadMesa);
        System.out.println("Descuento por cantidad de platos: " + (descuentoCantidad * 100) + "%");

        CalculoDescuento calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuentoCantidadCapacidad = calculoCantidadCapacidad.descuento(cantidades, capacidadMesa);
        System.out.println("Descuento por cantidad de platos y capacidad de la mesa: " + (descuentoCantidadCapacidad * 100) + "%");
    }

}
