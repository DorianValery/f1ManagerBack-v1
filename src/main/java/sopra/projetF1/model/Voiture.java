package sopra.projetF1.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private int maniabilite;
	private int vitesse;
	private int poids;
	private boolean etat;
	private int prix;
	@ManyToOne
	@JoinColumn(name="ecurie_id")
	private Ecurie ecurie;
	@ManyToOne
	@JoinColumn(name="inventaire_id")
	private Inventaire inventaire;
	
}
