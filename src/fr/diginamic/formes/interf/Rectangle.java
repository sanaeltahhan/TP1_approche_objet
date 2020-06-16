package fr.diginamic.formes.interf;

public class Rectangle implements ObjetGeometrique {
	
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
	public double perimetre() {
		double perimetreRec = (this.longeur * this.largeur) * 2;
		return perimetreRec;
	}

	@Override
	public double surface() {
		double surfaceRec = this.longeur * this.largeur;
		return surfaceRec;
	}

}
