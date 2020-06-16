package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {

		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		
		// Création du premier iterator 
		Iterator <String> iterator1 = liste1.iterator();
		while (iterator1.hasNext()) {
			liste3.add(iterator1.next());
		}
		
		// Création du second iterator 
		
		Iterator <String> iterator2 = liste2.iterator();
		while (iterator2.hasNext()) {
			liste3.add(iterator2.next());
		}
		
		System.out.println(liste1);
		System.out.println(liste2);
		System.out.println(liste3);
	}

}
