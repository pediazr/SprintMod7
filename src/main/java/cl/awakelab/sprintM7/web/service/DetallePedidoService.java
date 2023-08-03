package cl.awakelab.sprintM7.web.service;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.DetallePedidoDTO;
import cl.awakelab.sprintM7.model.persistence.repository.DetallePedidoId;

import java.util.List;
import java.util.Optional;

public interface DetallePedidoService {
    Optional<List<DetallePedidoDTO>> findAll();
    Optional<DetallePedidoDTO> findById(DetallePedidoId id);
    Optional<DetallePedidoDTO> create(DetallePedidoDTO detallePedidoDTO);
    Optional<DetallePedidoDTO> update(DetallePedidoDTO detallePedidoDTO);
    boolean delete(int id);
}
