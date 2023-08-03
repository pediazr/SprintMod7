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
public class CamareroDTO {
    private int id;
    private String nombre;
    private int edad;
    private Date fechaInicio;

}
