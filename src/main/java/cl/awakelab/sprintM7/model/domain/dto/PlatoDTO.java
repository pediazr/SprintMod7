package cl.awakelab.sprintM7.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlatoDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private String precio;
    private String categoria;
}
