package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * Classe Recensement qui permet de lire le contenu du fichier et de le parser 
 * 
 * @author eltahhansana
 *
 */
public class RecensementUtil {
	
	/**
	 *  Méthode qui permet de lire le contenu d'un fichier et de le parser afin d'instancier une ville au format voulu
	 * 
	 */
	public static Recensement lire(){
		
		Recensement recensement = new Recensement();
		
		
		try {
			File file = new File("/Users/eltahhansana/Documents/DTA_Ing/Java11/TP_approche_objet/recensement 2016.csv");
			
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			// Permet de retirer l'entête du fichier CSV de la liste
		    lignes.remove(0);
		    
		    // Pour chaque ligne parser les données
			for (String ligne : lignes ) {
				
				Parseur.ajoutLigne(recensement, ligne);	

			}return recensement;
			
		} catch (IOException e){
				
			System.out.println(e.getMessage());
			return null;
				
		}
		
	}
}
