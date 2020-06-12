package fr.diginamic.formes;

/**
 * 
 * Classe Cercle specialisation de la classe Forme
 * @author eltahhansana
 *
 */
public class Cercle extends Forme {

	/** rayon du cercle*/
	private double rayon;

	/**
	 * Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	@Override
	public double calculerSurface() {
		double surfaceCer = Math.PI * Math.pow(rayon, 2);
		return surfaceCer;
	}

	@Override
	public double calculerPerimetre() {
		double perimetreCerc = rayon * 2 * Math.PI;
		return perimetreCerc;
	}
	
	
}
