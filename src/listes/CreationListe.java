/**
 * 
 */
package listes;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe  CreationListe
 * @author eltahhansana
 *
 */
public class CreationListe {
	
	public static void main(String[] args) {
		
		// Initialisation de la list
		List<Integer> list = new ArrayList<Integer>();
		
		// Boucle pour ajouter des element dans la liste
		for (int i=0; i<100 ; i++) {
			list.add(i);
		}
		
		// Affichage taille de la liste 
		System.out.println("La taille de la liste est : " + list.size());
	}

}
