/**
 * 
 */
package fr.diginamic.testexceptions;

import sets.Pays;

/**
 * @author eltahhansana
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pays pays1 = new Pays("USA", 328_239_523, 62606);
		
		try {
			// Test sans probleme
			ReflectionUtils.afficherAttributs(pays1);
			// Test pour renvoyer l'exception
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
