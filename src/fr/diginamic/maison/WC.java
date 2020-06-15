/**
 * 
 */
package fr.diginamic.maison;

/**
 * Classe WC, fille de la classe Piece
 * 
 * @author eltahhansana
 *
 */
public class WC extends Piece {

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public WC(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String getType() {
		return "WC";
	}

}
