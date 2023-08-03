package cl.awakelab.sprintM7.web.service;

import cl.awakelab.sprintM7.model.domain.dto.PedidoDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {
    Optional<List<PedidoDTO>> findAll();
    Optional<PedidoDTO> findById(int id);
    Optional<PedidoDTO> create(PedidoDTO pedidoDTO);
    Optional<PedidoDTO> update(PedidoDTO pedidoDTO);
}
