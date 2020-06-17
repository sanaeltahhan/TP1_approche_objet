package maps;

public class Pays {
	
	private String nom;
	private int nbrHabitant;
	
	/** Constructeur
	 * @param nom
	 * @param nbrHabitant
	 */
	public Pays(String nom, int nbrHabitant) {
		super();
		this.nom = nom;
		this.nbrHabitant = nbrHabitant;
	}
	
	

	@Override
	public String toString() {
		return "nom=" + nom + ", nbrHabitant=" + nbrHabitant ;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrHabitant() {
		return nbrHabitant;
	}

	public void setNbrHabitant(int nbrHabitant) {
		this.nbrHabitant = nbrHabitant;
	}
	
	

}
