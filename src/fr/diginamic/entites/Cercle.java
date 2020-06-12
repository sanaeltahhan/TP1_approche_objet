package fr.diginamic.entites;

/**
 * Cercle represente la class d'un cercle
 * Elle est caractérisée par un rayon
 * 
 * @author eltahhansana
 *
 */
public class Cercle {
	
	/**
	 * Rayon du cercle
	 */
	private double rayon;
	
	

	/**Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	
	/**
	 * @param rayon
	 * @return Le calcul du perimetre du cercle
	 */
	public double calculPerimetre(double rayon) {
		return rayon * 2 * Math.PI;
		
	}
	
	/**
	 * @param rayon
	 * @return La surface du cercle
	 */
	public double calculSurface(double rayon) {
		return Math.PI * Math.pow(rayon, 2);
	}


	/**Getter
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param rayon the rayon to set
	 */
	private void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	

}
