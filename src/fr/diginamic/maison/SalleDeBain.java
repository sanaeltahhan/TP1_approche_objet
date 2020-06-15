/**
 * 
 */
package fr.diginamic.maison;

/**
 * Classe SalleDeBain, fille de la classe Piece
 * 
 * @author eltahhansana
 *
 */
public class SalleDeBain extends Piece {

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return "salle de bain";
	}
}
