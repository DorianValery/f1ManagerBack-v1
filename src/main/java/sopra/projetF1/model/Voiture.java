package sopra.projetF1.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private int maniabilite;
	private int vitesse;
	private int poids;
	private boolean etat;
	private int prix;
	@ManyToOne
	@JoinColumn(name="ecurie_id")
	private Ecurie ecurie;
	@ManyToOne
	@JoinColumn(name="inventaire_id")
	private Inventaire inventaire;
	
	public Voiture(Long id, String marque, int maniabilite, int vitesse, int poids, boolean etat, int prix,
			Ecurie ecurie, Inventaire inventaire) {
		super();
		this.id = id;
		this.marque = marque;
		this.maniabilite = maniabilite;
		this.vitesse = vitesse;
		this.poids = poids;
		this.etat = etat;
		this.prix = prix;
		this.ecurie = ecurie;
		this.inventaire = inventaire;
	}

	public Voiture() {
		// TODO Auto-generated constructor stub
	}

	
	public Voiture(String marque, int maniabilite, int vitesse, int poids, boolean etat, int prix) {
		this.marque = marque;
		this.maniabilite = maniabilite;
		this.vitesse = vitesse;
		this.poids = poids;
		this.etat = etat;
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getManiabilite() {
		return maniabilite;
	}

	public void setManiabilite(int maniabilite) {
		this.maniabilite = maniabilite;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
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
		return "Voiture [id=" + id + ", marque=" + marque + ", maniabilite=" + maniabilite + ", vitesse=" + vitesse
				+ ", poids=" + poids + ", etat=" + etat + ", prix=" + prix + ", ecurie=" + ecurie + ", inventaire="
				+ inventaire + "]";
	}
	
	
	
	
}
