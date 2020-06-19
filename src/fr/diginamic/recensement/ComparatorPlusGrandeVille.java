/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Comparator;

/**
 * Classe ComparatorPlusGrandeVille qui permet de trier les villes en fonction de leur population de la plus grande à la plus petite 
 * 
 * @author eltahhansana
 *
 */
public class ComparatorPlusGrandeVille implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		int result = Integer.valueOf(ville1.getPopulationTotale()).compareTo(ville2.getPopulationTotale());
		return -result;

	}

}
