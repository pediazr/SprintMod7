package cl.awakelab.sprintM7.model.domain.service;

import cl.awakelab.sprintM7.model.domain.dto.DetallePedidoDTO;
import cl.awakelab.sprintM7.model.persistence.mapper.DetallePedidoMapper;
import cl.awakelab.sprintM7.model.persistence.repository.DetallePedidoId;
import cl.awakelab.sprintM7.model.persistence.repository.DetallePedidoRepository;
import cl.awakelab.sprintM7.web.service.DetallePedidoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {
    private final DetallePedidoRepository repository;
    private final DetallePedidoMapper mapper;

    public DetallePedidoServiceImpl(DetallePedidoRepository repository, DetallePedidoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<DetallePedidoDTO>> findAll() {
        return Optional.of(mapper.toDetallePedidos(repository.findAll()));
    }

    @Override
    public Optional<DetallePedidoDTO> findById(DetallePedidoId id) {
        return Optional.empty();    }

    @Override
    public Optional<DetallePedidoDTO> create(DetallePedidoDTO detallePedidoDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<DetallePedidoDTO> update(DetallePedidoDTO detallePedidoDTO) {
        return Optional.empty();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
