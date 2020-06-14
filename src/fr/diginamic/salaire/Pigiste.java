/**
 * 
 */
package fr.diginamic.salaire;

/**
 * Classe fille de Intervenant, qui désigne un indépendant intervenant au sein du journal pour une courte durée, parfois une seule journée.
 * 
 * @author eltahhansana
 *
 */
public class Pigiste extends Intervenant {
	
	/** Attribut qui représente le nombre de jours travaillés pour la société durant le mois*/
	private double jourTravailles;
	
	/** Attribut qui représente le montant journalier de rémunération*/
	private double montantJournalierRemuneration;

	

	/** Constructeur
	 * @param prenom
	 * @param nom
	 * @param jourTravailles
	 * @param montantJournalierRemuneration
	 */
	public Pigiste(String prenom, String nom, double jourTravailles, double montantJournalierRemuneration) {
		super(prenom, nom);
		this.jourTravailles = jourTravailles;
		this.montantJournalierRemuneration = montantJournalierRemuneration;
	}

	@Override
	public double getSalaire() {
		double salaire = jourTravailles * montantJournalierRemuneration;
		return salaire;

	}
	
	@Override
	public String getStatut() {
		return "pigiste";
	}

}
