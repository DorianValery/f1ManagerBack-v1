package sopra.projetF1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Infrastructure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private typeInfra type;
	private int nbingenieurs;
	private int pitStop;
	private double experience;
	private boolean etat;
	private double prix;
	@OneToOne
	@JoinColumn(name="ecurie")
	private Ecurie ecurie;
	@ManyToOne
	@JoinColumn(name="inventaire")
	private Inventaire inventaire;
	
	public Infrastructure(Long id, String nom, typeInfra type, int nbingenieurs, int pitStop, double experience,
			boolean etat, double prix, Ecurie ecurie, Inventaire inventaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.nbingenieurs = nbingenieurs;
		this.pitStop = pitStop;
		this.experience = experience;
		this.etat = etat;
		this.prix = prix;
		this.ecurie = ecurie;
		this.inventaire = inventaire;
	}
	
	public Infrastructure(Long id, String nom, typeInfra type, int nbingenieurs, int pitStop, double experience,
			boolean etat, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.nbingenieurs = nbingenieurs;
		this.pitStop = pitStop;
		this.experience = experience;
		this.etat = etat;
		this.prix = prix;
	}

	public Infrastructure() {
		// TODO Auto-generated constructor stub
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

	public typeInfra getType() {
		return type;
	}

	public void setType(typeInfra type) {
		this.type = type;
	}

	public int getNbingenieurs() {
		return nbingenieurs;
	}

	public void setNbingenieurs(int nbingenieurs) {
		this.nbingenieurs = nbingenieurs;
	}

	public int getPitStop() {
		return pitStop;
	}

	public void setPitStop(int pitStop) {
		this.pitStop = pitStop;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Ecurie getEcurie() {
		return ecurie;
	}

	public void setEcurie(Ecurie ecurie) {
		this.ecurie = ecurie;
	}

	public Inventaire getInventaire() {
		return inventaire;
	}

	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}

	@Override
	public String toString() {
		return "Infrastructure [id=" + id + ", nom=" + nom + ", type=" + type + ", nbingenieurs=" + nbingenieurs
				+ ", pitStop=" + pitStop + ", experience=" + experience + ", etat=" + etat + ", prix=" + prix
				+ ", ecurie=" + ecurie + ", inventaire=" + inventaire + "]";
	}
	
	
}
