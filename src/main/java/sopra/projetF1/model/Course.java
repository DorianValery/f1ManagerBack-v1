package sopra.projetF1.model;

import java.time.Duration;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int nombreTour; 
	private Duration tempsRef;
	private double cashPrize;
	@OneToMany(mappedBy = "course")
	private List <Position> classement;
	private double popularite;
	@ManyToMany
	@JoinTable(name = "ecuriesInscrites", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "ecurie_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
			"course_id", "ecurie_id" }))
	private List<Ecurie> ecuries;
	
	
	
}
