package sopra.projetF1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projetF1.model.Position;

public interface IPositionRepository extends JpaRepository<Position, Long>{

}
