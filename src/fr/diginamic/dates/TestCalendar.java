package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {

		// Date à la date du 19 mai 2016 à 23h59 et 30 secondes et affichez la au format suivant : jour/mois/année
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 30);
		
		Date date = cal.getTime();
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formattage.format(date));
		
		// Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du jour.
		
		Calendar calendrierMaintenant = Calendar.getInstance();
		Date maintenant = calendrierMaintenant.getTime();
		System.out.println("Aujourd'hui nous sommes le : " + formattage.format(maintenant));
	}

}
