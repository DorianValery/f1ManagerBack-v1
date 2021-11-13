package sopra.projetF1.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Inventaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int argentDisponible;
	@OneToOne(mappedBy = "inventaire")
	private Joueur joueur;
	@OneToMany(mappedBy ="inventaire")
	private List<Infrastructure> infrastructure;
	@OneToMany(mappedBy = "inventaire")
	private List <Voiture> voitures;
	@OneToMany(mappedBy ="inventaire")
	private List<Pilote> pilotes;
}
