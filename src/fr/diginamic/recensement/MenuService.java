package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe mère MenuService 
 * 
 * @author eltahhansana
 *
 */
public abstract class MenuService {
	
	/** Méthode abstraite permettent de traiter une demande, elle doit être redéfini dans chaque fille 
	 * @param recensement lignes du fichier
	 * @param scanner scanner
	 */
	public abstract void traiter (Recensement recensement, Scanner scanner);

}
