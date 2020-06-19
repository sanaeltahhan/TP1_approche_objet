package fr.diginamic.testenumeration;

public class Pays {
	
	private String nom;
	private int nbrHabitant;
	private double pib;
	private Continent continent;
	
	
	/** Constructeur
	 * @param nom
	 * @param nbrHabitant
	 * @param pib
	 * @param continent

	 */
	public Pays(String nom, int nbrHabitant, double pib, Continent continent) {
		super();
		this.nom = nom;
		this.nbrHabitant = nbrHabitant;
		this.pib = pib;
		this.continent = continent;
	}
	
	

	@Override
	public String toString() {
		return "nom=" + nom + ", nbrHabitant=" + nbrHabitant + ", pib=" + pib + ", le continent : " + continent.getNom() ;
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
	
	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}



	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}	
	

}
