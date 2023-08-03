package cl.awakelab.sprintM7.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MesaDTO {
    private int id;
    private int numero;
    private int capacidad;
    private String ubicacion;

}
