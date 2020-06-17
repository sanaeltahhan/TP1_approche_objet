package sets;

public class Pays {
	
	private String nom;
	private int nbrHabitan;
	private double pib;
	
	/** Constructeur
	 * @param nom
	 * @param nbrHabitan
	 * @param pib
	 */
	public Pays(String nom, int nbrHabitan, double pib) {
		super();
		this.nom = nom;
		this.nbrHabitan = nbrHabitan;
		this.pib = pib;
	}
	
	

	@Override
	public String toString() {
		return "nom=" + nom + ", nbrHabitan=" + nbrHabitan + ", pib=" + pib ;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrHabitan() {
		return nbrHabitan;
	}

	public void setNbrHabitan(int nbrHabitan) {
		this.nbrHabitan = nbrHabitan;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}
	
	

}
