package repository;

import domain.Perso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersoRepository extends JpaRepository<Perso, Long> {
}
