package sopra.projetF1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projetF1.model.Joueur;

public interface IJoueurRepository extends JpaRepository<Joueur, Long>{
//findAllJoueur
//findJoueurById
//findJoueurByEmail
//findJoueurByPeudo
//findJoueurByTelephone
}
