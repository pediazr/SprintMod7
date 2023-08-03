package cl.awakelab.sprintM7.model.persistence.mapper;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Camarero;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CamareroMapper {
    @Mappings({
            @Mapping(source ="id", target ="id"),
            @Mapping(source ="nombre", target ="nombre"),
            @Mapping(source ="edad", target ="edad"),
            @Mapping(source ="fechaInicio", target ="fechaInicio"),


    })
    Camarero toCamarero(CamareroDTO camareroDTO);
    List<Camarero> toCamarero(List<CamareroDTO> camareroDTO);
    @InheritInverseConfiguration
    CamareroDTO toCamareroDTO(Camarero camarero);




}
