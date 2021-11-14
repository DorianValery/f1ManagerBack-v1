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
	
	public Ecurie() {}
	
	public Ecurie(Long id, String nom, double argent, double experience, Infrastructure infrastructure,
			List<Voiture> voitures, List<Pilote> pilotes, List<Course> courses) {
		super();
		this.id = id;
		this.nom = nom;
		this.argent = argent;
		this.experience = experience;
		this.infrastructure = infrastructure;
		this.voitures = voitures;
		this.pilotes = pilotes;
		this.courses = courses;
	}

	public Ecurie(String nom, double argent, double experience) {
		this.nom = nom;
		this.argent = argent;
		this.experience = experience;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getArgent() {
		return argent;
	}

	public void setArgent(double argent) {
		this.argent = argent;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public Infrastructure getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}

	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public List<Pilote> getPilotes() {
		return pilotes;
	}

	public void setPilotes(List<Pilote> pilotes) {
		this.pilotes = pilotes;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Ecurie [id=" + id + ", nom=" + nom + ", argent=" + argent + ", experience=" + experience
				+ ", infrastructure=" + infrastructure + ", voitures=" + voitures + ", pilotes=" + pilotes
				+ ", courses=" + courses + "]";
	}
	
	
	
}
