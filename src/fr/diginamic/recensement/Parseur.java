/**
 * 
 */
package fr.diginamic.recensement;

/**
 * @author eltahhansana
 *
 */
public class Parseur {
	
	public static void ajoutLigne(Recensement recensement, String ligne) {
		
		// Decoupages de chaque ligne en tableau de chaine de caractère grâce au séparateur ";"
		String [] parties = ligne.split(";");
		
		// Affectation de chaque case du tableau au variable correspondante
		int codeRegion = Integer.parseInt(parties[0]);
		String nomRegion = parties[1];
		String codeDepartement = parties[2];
		int codeCommune = Integer.parseInt(parties[5]);
		String nomCommune = parties[6];
		String populationTot = parties[9];
		
		// On enleve les espaces pour la population et on convertit en int
		int populationTotale = Integer.parseInt(populationTot.replace(" ", "").trim());
						
		// Instanciation d'un objet Ville avec les informations récupérées
		Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
		
		
		// Instanciation d'un objet Region avec les information récupérées
		Region region = new Region(nomRegion, codeRegion );
		region.addVille(ville);
		
		// Instanciation d'un objet Département avec les informations récupérées
		Departement departement = new Departement(codeDepartement);
		departement.addVille(ville);
		
		// Ajout des objets Ville, Region et Departement a des listes
		recensement.getListVilles().add(ville);
		recensement.getListRegions().add(region);
		recensement.getListDepartement().add(departement);
		
	}

}
