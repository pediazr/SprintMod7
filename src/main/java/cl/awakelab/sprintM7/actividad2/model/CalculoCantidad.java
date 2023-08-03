package cl.awakelab.sprintM7.actividad2.model;

import cl.awakelab.sprintM7.actividad2.inter.CalculoDescuento;

import java.util.List;

public class CalculoCantidad implements CalculoDescuento {

    @Override
    public double descuento(List<Integer> cantidades, int capacidadMesa) {
        int totalPlatos = cantidades.stream().mapToInt(Integer::intValue).sum();
        if (totalPlatos <= 5) {
            return 0.0;
        } else if (totalPlatos < 10) {
            return 0.03;
        } else if (totalPlatos <= 15) {
            return 0.05;
        } else {
            return 0.3;
        }

    }
}
