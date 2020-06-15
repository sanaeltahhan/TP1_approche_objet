package fr.diginamic.maison;

/**
 * Classe Piece 
 * 
 * @author eltahhansana
 *
 */
public abstract class Piece {
	
	/** superficie d'une piece*/
	private double superficie;
	
	/** numero de l'etage*/
	private int etage;
	
	/** Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}
	
	/**
	 * Méthode abstraite pour déterminer le type de pièce, à redéfinir dans chaque pièce 
	 * @return String le type de pièce
	 */
	public abstract String getType();

	/**Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**Getter
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/**Setter
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	
	
	

}
