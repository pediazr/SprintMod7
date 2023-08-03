package cl.awakelab.sprintM7.web.service;

import cl.awakelab.sprintM7.model.domain.dto.PlatoDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Plato;

import java.util.List;
import java.util.Optional;

public interface PlatoService {
    Optional<List<PlatoDTO>> findAll();
    Optional<PlatoDTO> findById(int id);
    Optional<PlatoDTO> create(PlatoDTO platoDTO);
    Optional<PlatoDTO> update(PlatoDTO platoDTO);
    boolean delete(int id);
}
