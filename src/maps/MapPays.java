package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		
		Set<Pays> set = new HashSet<>();
		set.add(new Pays("France", 69_861_344, 43551));
		set.add(new Pays("Allemagne", 82_801_531, 50206));
		set.add(new Pays("UK", 63_421_628, 43620));
		set.add(new Pays("Italie", 61_302_519, 37970));
		set.add(new Pays("Japon", 124_856_424, 42659));
		set.add(new Pays("USA", 328_239_523, 62606));
		set.add(new Pays("Chine", 1_408_089_559, 16624));
		set.add(new Pays("Russie", 126_434_660, 27900));
		set.add(new Pays("Inde", 1_386_249_417, 5174));
		
		// Initialisation de la map
		HashMap<String, Pays> mapPays = new HashMap<>();
		
		// Remplissage de la map
		for (Pays pays: set) {
			mapPays.put(pays.getNom(), pays);
		}
		
		// On stocke le premier element de la map dans une variable
		Pays paysMinHab = mapPays.values().iterator().next();
		
		//Pour chaque pays de la map on regarde si son nbrHabitant est inferieur a paysMinHab.getNbrHabitant
		for (Pays pays : mapPays.values()) {
			if (pays.getNbrHabitant() < paysMinHab.getNbrHabitant()) {
				paysMinHab = pays;
			}
		}
		
		// Suppression du pays au nbrHabitant le plus petit
		mapPays.remove(paysMinHab.getNom());
		
		// Affichage du pays au nbrHabitant le plus petit
		System.out.println("Le pays supprimé est : " + paysMinHab.getNom());
		
		System.out.println();
		
		// Affichage de la map après suppression
		for (Pays pays : mapPays.values()) {
			System.out.println(pays);
		}
		


	}

}
