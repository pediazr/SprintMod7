package cl.awakelab.sprintM7.actividad2.Test;

import cl.awakelab.sprintM7.actividad2.inter.CalculoDescuento;
import cl.awakelab.sprintM7.actividad2.model.CalculoCantidad;
import cl.awakelab.sprintM7.actividad2.model.CalculoCantidadCapacidad;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculoDescuentoTests {
    @Test
    public void testCalculoCantidad() {
        CalculoDescuento calculo = new CalculoCantidad();

        List<Integer> cantidades = Arrays.asList(2, 3, 5);
        int capacidadMesa = 6;
        double descuento = calculo.descuento(cantidades, capacidadMesa);

        assertEquals(0.05, descuento, descuento);
    }

    @Test
    public void testCalculoCantidadCapacidad() {
        CalculoDescuento calculo = new CalculoCantidadCapacidad();

        List<Integer> cantidades = Arrays.asList(7, 8, 10);
        int capacidadMesa = 5;
        double descuento = calculo.descuento(cantidades, capacidadMesa);

        assertEquals(0.20, descuento,descuento);
    }

    @Test
    public void testCalculoCantidadBorde() {
        CalculoDescuento calculo = new CalculoCantidad();

        List<Integer> cantidades = Arrays.asList(5);
        int capacidadMesa = 4;
        double descuento = calculo.descuento(cantidades, capacidadMesa);

        assertEquals(0.0, descuento, descuento);
    }

    @Test
    public void testCalculoCantidadCapacidadBorde() {
        CalculoDescuento calculo = new CalculoCantidadCapacidad();

        List<Integer> cantidades = Arrays.asList(16);
        int capacidadMesa = 7;
        double descuento = calculo.descuento(cantidades, capacidadMesa);

        assertEquals(0.30, descuento, descuento);
    }
}
