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
	
	public Inventaire(Long id, int argentDisponible, Joueur joueur, List<Infrastructure> infrastructure,
			List<Voiture> voitures, List<Pilote> pilotes) {
		super();
		this.id = id;
		this.argentDisponible = argentDisponible;
		this.joueur = joueur;
		this.infrastructure = infrastructure;
		this.voitures = voitures;
		this.pilotes = pilotes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getArgentDisponible() {
		return argentDisponible;
	}

	public void setArgentDisponible(int argentDisponible) {
		this.argentDisponible = argentDisponible;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public List<Infrastructure> getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(List<Infrastructure> infrastructure) {
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

	@Override
	public String toString() {
		return "Inventaire [id=" + id + ", argentDisponible=" + argentDisponible + ", joueur=" + joueur
				+ ", infrastructure=" + infrastructure + ", voitures=" + voitures + ", pilotes=" + pilotes + "]";
	}
	
	
	
	
}
