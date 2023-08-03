package cl.awakelab.sprintM7.model.domain.service;

import cl.awakelab.sprintM7.model.domain.dto.PedidoDTO;
import cl.awakelab.sprintM7.model.domain.dto.PlatoDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Plato;
import cl.awakelab.sprintM7.model.persistence.mapper.PlatoMapper;
import cl.awakelab.sprintM7.model.persistence.repository.PlatoRepository;
import cl.awakelab.sprintM7.web.service.PlatoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlatoServiceImpl implements PlatoService {
private final PlatoRepository repository;
private final PlatoMapper mapper;

    public PlatoServiceImpl(PlatoRepository repository, PlatoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<PlatoDTO>> findAll() {
        return Optional.of(mapper.toPlatos(repository.findAll()));
    }

    @Override
    public Optional<PlatoDTO> findById(int id) {
        return repository.findById(id).map(mapper::toPlato);
    }

    @Override
    public Optional<PlatoDTO> create(PlatoDTO platoDTO) {
        return Optional.of(mapper.toPlato(repository.save(mapper.toPlatoDTO(platoDTO))));
    }

    @Override
    public Optional<PlatoDTO> update(PlatoDTO platoDTO) {
        if (repository.existsById(platoDTO.getId())){
            return Optional.of(mapper.toPlato(repository.save(mapper.toPlatoDTO(platoDTO))));        }
        return Optional.of(new PlatoDTO());
    }
}
