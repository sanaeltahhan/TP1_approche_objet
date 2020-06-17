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



	// Implémentez la méthode compareTo de manière à ce que le tri se fasse sur le nom de pays (par ordre alphabétique)
	@Override
	public int compareTo(Pays pays) {
		int result = this.nom.compareTo(pays.getNom());
		return result;
	}
	
	

}
