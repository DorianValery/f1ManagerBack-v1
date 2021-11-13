package sopra.projetF1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projetF1.model.Voiture;

public interface IVoitueRepository extends JpaRepository<Voiture, Long>{

}
