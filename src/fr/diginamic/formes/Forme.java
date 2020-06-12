package fr.diginamic.formes;

/**
 * Classe abstraite Forme
 * @author eltahhansana
 *
 */
public abstract class Forme {
	
	/** Methode abstraite pour qu'une forme calcul sa surface
	 * @return double
	 */
	public abstract double calculerSurface();

	/** Methode abstraite pour qu'une forme calcul son perimetre
	 * @return double
	 */
	public abstract double calculerPerimetre();

}
