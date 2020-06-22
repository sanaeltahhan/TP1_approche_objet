/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Comparator;

/**
 * Classe ComparatorPlusGrandDepartement qui permet de trier les département en fonction de leur population de la plus grande à la plus petite
 * @author eltahhansana
 *
 */
public class ComparatorPlusGrandDepartement implements Comparator<Departement> {
	
	@Override
	public int compare(Departement departement1, Departement departement2) {
		int result = Integer.valueOf(departement1.getPopulation()).compareTo(departement2.getPopulation());
		return -result;

	}

}
