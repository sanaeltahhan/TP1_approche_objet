package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {

		
		List<Ville> listeVille = new ArrayList<Ville>();
		
		listeVille.add(new Ville ("Nice", 343000));
		listeVille.add(new Ville ("Carcassonne", 47800));
		listeVille.add(new Ville ("Narbonne", 53400));
		listeVille.add(new Ville ("Lyon", 484000));
		listeVille.add(new Ville ("Foix", 9700));
		listeVille.add(new Ville ("Pau", 77200));
		listeVille.add(new Ville ("Marseille", 850700));
		listeVille.add(new Ville ("Tarbes", 40600));
		
		// Recherchez et affichez la ville la plus peuplée
		
		int nbVillePlusPeuplee = listeVille.get(0).getNbHabitant();
		String villePlusPeuplee = listeVille.get(0).getNom();
		
		Iterator <Ville> iterator1 = listeVille.iterator();
		while (iterator1.hasNext()) {
			Ville valueNext = iterator1.next();
			if (valueNext.getNbHabitant() > nbVillePlusPeuplee) {
				nbVillePlusPeuplee = valueNext.getNbHabitant(); 
				villePlusPeuplee = valueNext.getNom();
			}
		}
		System.out.println("La liste de ville est : " + listeVille);
		System.out.println("La ville la plus peuplée est : " + villePlusPeuplee + " avec " + nbVillePlusPeuplee + " habitants." );
		
		//Supprimez la ville la moins peuplée
		
		int nbVilleMoinsPeuplee = listeVille.get(0).getNbHabitant();
		String villeMoinsPeuplee = listeVille.get(0).getNom();
		Ville villeSupp = listeVille.get(0);
		
		Iterator <Ville> iterator2 = listeVille.iterator();
		while (iterator2.hasNext()) {
			Ville valueNext = iterator2.next();
			if (valueNext.getNbHabitant() < nbVilleMoinsPeuplee) {
				nbVilleMoinsPeuplee = valueNext.getNbHabitant(); 
				villeMoinsPeuplee = valueNext.getNom();
				villeSupp = valueNext;
			}
		}
		listeVille.remove(villeSupp);
		System.out.println("La ville la moins peuplée est : " + villeMoinsPeuplee + " avec " + nbVilleMoinsPeuplee + " habitants." );
		System.out.println(listeVille);
		
		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		
		//int nbVillePlusCentMille = listeVille.get(0).getNbHabitant();
		//String villePlusCentMille = listeVille.get(0).getNom();
		//Ville ville = listeVille.get(0);
		
		for (int i= 0 ; i<listeVille.size(); i++ ) {
			if (listeVille.get(i).getNbHabitant() > 100000 ) {
				listeVille.get(i).setNom(listeVille.get(i).getNom().toUpperCase());
			}
		}
		
		System.out.println(listeVille);
		

		
		
		

	}

}
