package fr.diginamic.salaire;

/**
 * 
 * Classe mère, qui désigne une personne travaillant pour la société
 * 
 * @author eltahhansana
 *
 */
public abstract class Intervenant {
	
	private String prenom;
	private String nom;
	
	
	
	/**Constructeur
	 * @param prenom
	 * @param nom
	 */
	public Intervenant(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}



	/**
	 * Methode a redefinir dans les classes filles qui donne le salaire d'un intervenant.
	 * @return double montant du salaire
	 */
	public abstract double getSalaire();

	/**
	 * Methode a redéfinir dans les classes filles, elle donne le statut de l'intervenant
	 * @return
	 */
	public abstract String getStatut();
	
	
	
	/**
	 * Methode qui affiche les données d'un intervenant : nom, prenom, salaire et status
	 */
	public void afficherDonnees() {
		System.out.println("Le nom de l'intervenant est : " + nom + ", son prénom est : " + prenom + ", son salaire est de : " + getSalaire() + " €, et son statut est " + getStatut() + ".");
		
	}

}
