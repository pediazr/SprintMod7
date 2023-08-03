package cl.awakelab.sprintM7.actividad2.model;

import cl.awakelab.sprintM7.actividad2.inter.CalculoDescuento;

import java.util.List;

public class CalculoCantidadCapacidad implements CalculoDescuento {
    @Override
    public double descuento(List<Integer> cantidades, int capacidadMesa) {
        int totalPlatos = cantidades.stream().mapToInt(Integer::intValue).sum();
        if (totalPlatos > 5 && capacidadMesa < 4) {
            return 0.15;
        } else if (totalPlatos >= 5 && totalPlatos <= 15 && capacidadMesa >= 4 && capacidadMesa <= 6) {
            return 0.20;
        } else if (capacidadMesa > 6 && totalPlatos > 15) {
            return 0.30;
        } else if (capacidadMesa == 2 && totalPlatos > 5) {
            return 0.15;
        } else {
            return 0.0;
        }
    }
}
