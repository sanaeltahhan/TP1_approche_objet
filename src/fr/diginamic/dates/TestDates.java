/**
 * 
 */
package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author eltahhansana
 *
 */
public class TestDates {

	
	public static void main(String[] args) {

		Date date1 = new Date();
		
		// Affichez l’instance ainsi créée au format suivant : jour/mois/année
		
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		
		//SimpleDateFormat formatteur = new SimpleDateFormat("dd/MM/yyyy");   // Autre methode
		
		System.out.println(shortDateFormat.format(date1));
	
		// Créez une instance de la classe Date à la date du 19 mai 2016 à 23h59 et 30 secondes au format année/mois/jour heure:minute:seconde
		
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formatteur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
		String dateFormateur2 = formatteur2.format(date2);

		System.out.println(dateFormateur2);
		
		// Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus.
		
		System.out.println(formatteur2.format(date1));
	}

}
