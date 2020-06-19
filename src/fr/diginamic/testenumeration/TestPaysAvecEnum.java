package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.testenumeration.Pays;

public class TestPaysAvecEnum {

	public static void main(String[] args) {


		// Initialisation de la liste
		List<Pays> listPays = new ArrayList<>();
		
		// Remplissage de la liste
		listPays.add(new Pays("USA", 328_239_523, 62606, Continent.AMERIQUE));
		listPays.add(new Pays("France", 69_861_344, 43551, Continent.EUROPE));
		listPays.add(new Pays("Algerie", 124_856_424, 42659, Continent.AFRIQUE));
		listPays.add(new Pays("Chine", 1_408_089_559, 16624, Continent.ASIE));
		listPays.add(new Pays("Inde", 1_386_249_417, 5174, Continent.ASIE));
		
		// Initialisation cariables de comptage
		int amerique =0;
		int afrique =0;
		int asie =0;
		int europe =0;
		int oceanie =0;
		
		// Pour chaque pays incrementer le compteur pour chaque continent
		for (Pays pays: listPays) {
			if(pays.getContinent().equals(Continent.AMERIQUE)) {
				amerique = amerique +1;
			}
			else if (pays.getContinent().equals(Continent.AFRIQUE)){
				afrique = afrique +1;	
			}
			else if (pays.getContinent().equals(Continent.ASIE)) {
				asie = asie + 1;
			}
			else if (pays.getContinent().equals(Continent.OCEANIE)) {
				oceanie = oceanie + 1;
			}
			else {
				europe = europe +1;
			}
		}
		
		// Affichage
		System.out.println("Amerique : " + amerique);
		System.out.println("Afrique : " + afrique);
		System.out.println("Asie : " + asie);
		System.out.println("Oceanie : " + oceanie);
		System.out.println("Europe : " + europe);
				
	}

}
