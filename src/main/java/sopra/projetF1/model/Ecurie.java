package sopra.projetF1.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

public class Ecurie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private double argent;
	private double experience;
	@JoinColumn(name="infrastructure_id")
	private Infrastructure infrastructure;
	@OneToMany(mappedBy = "ecurie")
	private List<Voiture> voitures;
	@OneToMany(mappedBy = "ecurie")
	private List<Pilote> pilotes;
	@ManyToMany(mappedBy = "ecuries")
	private List<Course> courses;
}
