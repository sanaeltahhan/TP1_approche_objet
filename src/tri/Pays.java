package tri;

public class Pays implements Comparable<Pays> {
	
	private String nom;
	private int nbrHabitant;
	private double pib;
	
	/** Constructeur
	 * @param nom
	 * @param nbrHabitant
	 * @param pib
	 */
	public Pays(String nom, int nbrHabitant, double pib) {
		super();
		this.nom = nom;
		this.nbrHabitant = nbrHabitant;
		this.pib = pib;
	}
	
	

	@Override
	public String toString() {
		return "nom=" + nom + ", nbrHabitant=" + nbrHabitant + ", pib=" + pib ;
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

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}



	// Modifiez la classe Pays afin que désormais le tri se fasse sur le PIB/hab.
	public int compareTo(Pays pays) {
		int result = this.nbrHabitant - pays.getNbrHabitant();
		return result;
	}
	
	

}
