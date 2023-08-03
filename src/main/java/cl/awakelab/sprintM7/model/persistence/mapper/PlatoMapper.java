package cl.awakelab.sprintM7.model.persistence.mapper;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.PlatoDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Camarero;
import cl.awakelab.sprintM7.model.persistence.entity.Plato;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlatoMapper {
    @Mappings({
            @Mapping(source ="id", target ="id"),
            @Mapping(source ="nombre", target ="nombre"),
            @Mapping(source ="descripcion", target ="descripcion"),
            @Mapping(source ="precio", target ="precio"),
            @Mapping(source ="categoria", target ="categoria"),


    })
    PlatoDTO toPlato(Plato plato);
    List<PlatoDTO> toPlatos(List<Plato> plato);
    @InheritInverseConfiguration
    Plato toPlatoDTO(PlatoDTO platoDTO);




}
