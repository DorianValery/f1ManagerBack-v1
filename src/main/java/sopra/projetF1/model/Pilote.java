package sopra.projetF1.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Pilote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 private String nom;
	 private String prenom;
	 private int age;
	 private String nationalite;
	 @Enumerated(EnumType.STRING)
	 @Column(name = "civilite", length = 5)
	 private Civilite civ;
	 private double experience;
	 private boolean etat;
	 private double prix;
	 @ManyToOne
	 @JoinColumn(name="ecurie_id")
	 private Ecurie ecurie;
	 @OneToMany(mappedBy = "pilote")
	 private List <Position> positions;
	 @ManyToOne
	 @JoinColumn(name="inventaire_id")
	 private Inventaire inventaire;
	 

}
