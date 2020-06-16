package fr.diginamic.formes.interf;

public class Cercle implements ObjetGeometrique {
	
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
	public double perimetre() {
		double perimetreCerc = rayon * 2 * Math.PI;
		return perimetreCerc;
	}

	@Override
	public double surface() {
		double surfaceCer = Math.PI * Math.pow(rayon, 2);
		return surfaceCer;
	}

}
