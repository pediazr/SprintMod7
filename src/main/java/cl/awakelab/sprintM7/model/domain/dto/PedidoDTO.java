package cl.awakelab.sprintM7.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoDTO {
    private int id;
    private MesaDTO mesaDTO;
    private CamareroDTO camareroDTO;
    private Date fecha;
    private double total;
}
