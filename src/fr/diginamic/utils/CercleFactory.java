package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * 
 * Classe factory en relation avec la calsse Cercle
 * @author eltahhansana
 *
 */
public class CercleFactory {
	
	/** Methode qui retourne un cercle de rayon donner en parametre
	 * @param rayon 
	 * @return Cercle
	 */
	public static Cercle creerCercle (double rayon) {
		
		Cercle nvCercle = new Cercle(rayon);
		return nvCercle; 
	}

}
