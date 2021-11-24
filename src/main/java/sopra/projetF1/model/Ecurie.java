package sopra.projetF1.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ecurie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private double argent;
	private double experience;
	@OneToOne
	@JoinColumn(name="infrastructure_id")
	@OneToMany(mappedBy = "ecurie")
	private List<Infrastructure> infrastructures;
	@OneToMany(mappedBy = "ecurie")
	private List<Voiture> voitures;
	@OneToMany(mappedBy = "ecurie")
	private List<Pilote> pilotes;
	@ManyToMany(mappedBy = "ecurie")
	private List<Course> courses;
	
	public Ecurie() {}
	
	public Ecurie(Long id, String nom, double argent, double experience, List<Infrastructure> infrastructures,
			List<Voiture> voitures, List<Pilote> pilotes, List<Course> courses) {
		super();
		this.id = id;
		this.nom = nom;
		this.argent = argent;
		this.experience = experience;
		this.infrastructures = infrastructures;
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

	public List<Infrastructure> getInfrastructure() {
		return infrastructures;
	}

	public void setInfrastructure(List<Infrastructure> infrastructures) {
		this.infrastructures = infrastructures;
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
				+ ", infrastructure=" + infrastructures + ", voitures=" + voitures + ", pilotes=" + pilotes
				+ ", courses=" + courses + "]";
	}
	
	
	
}
