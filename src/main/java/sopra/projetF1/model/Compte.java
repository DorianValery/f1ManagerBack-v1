package sopra.projetF1.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String password;
	private Type type;
	@OneToOne
	@JoinColumn(name="joueur_id")
	private Joueur joueur;
	
}
