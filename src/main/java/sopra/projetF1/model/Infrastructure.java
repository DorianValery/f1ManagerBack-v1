package sopra.projetF1.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Infrastructure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String type;
	private int nbingenieurs;
	private int pitStop;
	private double experience;
	private boolean etat;
	private double prix;
	@ManyToOne
	@JoinColumn(name="ecurie_id")
	private Ecurie ecurie;
	@ManyToOne
	@JoinColumn(name="inventaire_id")
	private Inventaire inventaire;
	
}
