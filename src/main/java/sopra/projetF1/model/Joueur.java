package sopra.projetF1.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Joueur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String pseudo;
	private int age;
	private String mail;
	private String telephone;
	@Enumerated(EnumType.STRING)
	@Column(name = "civilite", length = 5)
	private Civilite civ;
	@OneToOne
	@JoinColumn(name="inventaire_id")
	private Inventaire inventaire;
	@OneToOne
	@JoinColumn(name="ecurie_id")
	private Ecurie ecurie;
}
