/**
 * 
 */
package fr.diginamic.maison;

/**
 * Classe Salon, fille de la classe Piece
 * 
 * @author eltahhansana
 *
 */
public class Salon extends Piece {

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String getType() {
		return "salon";
	}

}
