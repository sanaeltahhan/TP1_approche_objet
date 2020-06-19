package fr.diginamic.testenumeration;

/**
 * Enum continent
 * @author eltahhansana
 *
 */
public enum Continent {
	
	EUROPE("Europe"),
	ASIE("Asie"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie"),
	AMERIQUE("Amerique");
	
	private String nom;

	/** Constructeur
	 * @param nom
	 */
	private Continent(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
	

}
