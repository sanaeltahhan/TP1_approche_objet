package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * Classe LectureFichier
 * 
 * @author eltahhansana
 *
 */
public class LectureFichier {

	public static void main(String[] args) {
		
		try {
			File file = new File("/Users/eltahhansana/Documents/DTA_Ing/Java11/TP_approche_objet/recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			for (String ligne : lignes ) {
				System.out.println(ligne);
			}
			
			System.out.println();
			
			System.out.println("Le nombre de lignes du fichier est de : " + lignes.size());
		}
		catch (IOException e){
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
