package sopra.projetF1.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.projetF1.model.Compte;

public interface ICompteRepository extends JpaRepository<Compte, Long> {	
//findAllCompte
@Query("select c from Compte c")
List<Compte> findAllCompte(@Param("compt") Compte compte);

//findCompteById
@Query("select c from Compte c where c.id = :id")
Optional<Compte> findFormateurById(@Param("id") Long id);

//findCompteByType
@Query("select c from Compte c where c.type = :type")
Optional<Compte> findFormateurByType(@Param("type") Long type);

}
