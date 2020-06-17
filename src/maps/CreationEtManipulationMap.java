package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Baurdeaux");
		
		// Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		Iterator <Integer> numDep = mapVilles.keySet().iterator();
		while(numDep.hasNext()) {
			Integer value = numDep.next();
			System.out.println(value);
						
		}
		
		System.out.println();
		
		// Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		Iterator <Integer> iter = mapVilles.keySet().iterator();
		while(iter.hasNext()) {
			Integer value = iter.next();			
			System.out.println(value +  " " + mapVilles.get(value));
			
		}
		
		System.out.println();
		
		// Afficher la taille de la map
		System.out.println("La taille de la map est de : " + mapVilles.size());
	}
	
	

}
