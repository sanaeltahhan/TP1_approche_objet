package fr.diginamic.maison;

/**
 * Classe Cuisine, fille de la clace Piece
 * 
 * @author eltahhansana
 *
 */
public class Cuisine extends Piece {

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String getType() {
		return "cuisine";
	}

}
