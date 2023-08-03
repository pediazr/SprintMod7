package cl.awakelab.sprintM7.model.persistence.repository;

import cl.awakelab.sprintM7.model.persistence.entity.Camarero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamareroRepository extends JpaRepository<Camarero,Integer> {
}
