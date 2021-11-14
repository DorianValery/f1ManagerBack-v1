package sopra.projetF1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projetF1.model.Inventaire;

public interface IInventaireRepository extends JpaRepository<Inventaire, Long>{
//findAllInventaire
//findInventaireById
//findInventaireByJoueur
}
