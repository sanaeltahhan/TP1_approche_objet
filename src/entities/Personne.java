package entities;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	public String toString() {
	    return prenom + " " + nom.toUpperCase() + ", " + adressePostale;
	}
	
	public String changeNom(String nom) {
		this.nom = nom;
		return nom;
	}
	
	public String changePrenom(String prenom) {
		this.prenom = prenom;
		return prenom;
	}
		
	public AdressePostale changeAdressePostale(AdressePostale adr) {
		this.adressePostale = adr;
		return adressePostale;
	}

	// GETTERS AND SETTERS

	public String getNom() {
		return nom;
	}

	//Autre methode pour modif nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	
	

}
