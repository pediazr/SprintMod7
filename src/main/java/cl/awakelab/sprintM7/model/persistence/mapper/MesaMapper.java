package cl.awakelab.sprintM7.model.persistence.mapper;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.MesaDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Camarero;
import cl.awakelab.sprintM7.model.persistence.entity.Mesa;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MesaMapper {
    @Mappings({
            @Mapping(source ="id", target ="id"),
            @Mapping(source ="numero", target ="numero"),
            @Mapping(source ="capacidad", target ="capacidad"),
            @Mapping(source ="ubicacion", target ="ubicacion"),


    })
    Mesa toMesa(MesaDTO mesaDTO);
    List<Mesa> toMesa(List<MesaDTO> mesaDTO);
    @InheritInverseConfiguration
    MesaDTO toMesaDTO(Mesa mesa);




}
