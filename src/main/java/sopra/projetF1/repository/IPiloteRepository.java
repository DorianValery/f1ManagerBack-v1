package sopra.projetF1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projetF1.model.Pilote;

public interface IPiloteRepository extends JpaRepository<Pilote, Long>{
//findAllPilote
//findPiloteById
//findPiloteByNom
//findPiloteByNationalité
//findPiloteByJoueur
//findPiloteByPrix
}
