/**
 * 
 */
package fr.diginamic.maison;

/**
 * Classe Chambre fille de la classe Piece 
 * 
 * @author eltahhansana
 *
 */
public class Chambre extends Piece {

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String getType() {
		return "chambre";
	}
	

}
