package cl.awakelab.sprintM7.web.service;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Camarero;

import java.util.List;
import java.util.Optional;

public interface CamareroService {
    Optional<List<CamareroDTO>> findAll();
    Optional<CamareroDTO> findById(int id);
    Optional<CamareroDTO> create(CamareroDTO camareroDTO);
    Optional<CamareroDTO> update(CamareroDTO camareroDTO);
}
