package fr.diginamic.formes;

/**
 * Classe Rectange specification de la classe Forme
 * @author eltahhansana
 *
 */
public class Rectangle extends Forme {
	
	/** longeur du rectangle*/
	private double longeur;

	/** largeur du rectangle*/
	private double largeur;


	/**
	 * Constructeur
	 * @param longeur
	 * @param largeur
	 */
	public Rectangle(double longeur, double largeur) {
		this.longeur = longeur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		double surfaceRec = this.longeur * this.largeur;
		return surfaceRec;
	}

	@Override
	public double calculerPerimetre() {
		double perimetreRec = (this.longeur * this.largeur) * 2;
		return perimetreRec;
	}

}
