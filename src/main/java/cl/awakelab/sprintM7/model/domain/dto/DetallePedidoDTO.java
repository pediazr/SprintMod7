package cl.awakelab.sprintM7.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetallePedidoDTO {

    private PedidoDTO pedidoDTO;
    private PlatoDTO platoDTO;
    private int cantidad;
    private double subtotal;

 }
