package cl.awakelab.sprintM7.model.persistence.mapper;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.DetallePedidoDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Camarero;
import cl.awakelab.sprintM7.model.persistence.entity.DetallePedido;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PedidoMapper.class, PlatoMapper.class})
public interface DetallePedidoMapper {
    @Mappings({
            @Mapping(source ="pedido", target ="pedido"),
            @Mapping(source ="plato", target ="plato"),
            @Mapping(source ="cantidad", target ="cantidad"),
            @Mapping(source ="subtotal", target ="subtotal"),


    })
    DetallePedidoDTO toDetallePedido(DetallePedido detallePedido);
    List<DetallePedidoDTO> toDetallePedidos(List<DetallePedido> detallePedido);
    @InheritInverseConfiguration
    DetallePedido toDetallePedidoDTO(DetallePedidoDTO detallePedidoDTO);




}
