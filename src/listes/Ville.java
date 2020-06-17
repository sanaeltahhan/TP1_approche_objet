package listes;

public class Ville {
	
	private String nom;
	private int nbHabitant;
	
	/** Constructeur
	 * @param nom
	 * @param nbHabitant
	 */
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	
	

	@Override
	public String toString() {
		return "nom : " + nom + ", nbHabitant=" + nbHabitant ;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	
	
	
	
	

}
