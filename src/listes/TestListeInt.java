package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		// Initialisation de la list
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.println("La liste : " + liste);
		System.out.println("La taille de la liste est : " + liste.size());
		
		int plusGrandElement = Integer.MIN_VALUE;;
		
		// Création du iterator
		//Recherchez et affichez le plus grand élément de la liste
		Iterator <Integer> iterator1 = liste.iterator();
		while (iterator1.hasNext()) {
			int valueNext = iterator1.next();
			if (valueNext > plusGrandElement) {
				plusGrandElement = valueNext;
			}
		}
		// Afficher le grand element de la liste
		System.out.println("Le plus grand élément de la liste est : " + plusGrandElement);
		
		// Supprimez le plus petit élément de la liste et affichez le résultat
		int plusPetitElement = Integer.MAX_VALUE;;
		Iterator <Integer> iterator2 = liste.iterator();
		while (iterator2.hasNext()) {
			int valueNext = iterator2.next();
			if (valueNext < plusPetitElement) {
				plusPetitElement = valueNext;
			}
		}
		System.out.println("Le plus petit élément de la liste est : " + plusPetitElement);
		liste.remove(Integer.valueOf(plusPetitElement));
		System.out.println("La nouvel liste est : " + liste);
		
		//Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs.
		for ( int i=0; i<liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, -liste.get(i));
			}
		}
		System.out.println("La nouvel liste est : " + liste);
		
		
	}

}
