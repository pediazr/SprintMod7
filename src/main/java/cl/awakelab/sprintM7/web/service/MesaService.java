package cl.awakelab.sprintM7.web.service;

import cl.awakelab.sprintM7.model.domain.dto.MesaDTO;
import cl.awakelab.sprintM7.model.persistence.entity.Mesa;

import java.util.List;
import java.util.Optional;

public interface MesaService {
    Optional<List<MesaDTO>> findAll();
    Optional<MesaDTO> findById(int id);
    Optional<MesaDTO> create(MesaDTO mesaDTO);
    Optional<MesaDTO> update(MesaDTO mesaDTO);
    boolean delete(int id);
}
