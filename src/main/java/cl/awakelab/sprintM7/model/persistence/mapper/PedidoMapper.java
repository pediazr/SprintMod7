package cl.awakelab.sprintM7.model.persistence.mapper;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.PedidoDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Camarero;
import cl.awakelab.sprintM7.model.persistence.entity.Pedido;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MesaMapper.class, CamareroMapper.class})
public interface PedidoMapper {
    @Mappings({
            @Mapping(source ="id", target ="id"),
            @Mapping(source ="mesa", target ="mesa"),
            @Mapping(source ="camarero", target ="camarero"),
            @Mapping(source ="fecha", target ="fecha"),
            @Mapping(source ="total", target ="total"),


    })
    PedidoDTO toPedido(Pedido pedido);
    List<PedidoDTO> toPedidos(List<Pedido> pedido);
    @InheritInverseConfiguration
    Pedido toPedidoDTO(PedidoDTO pedidoDTO);




}
