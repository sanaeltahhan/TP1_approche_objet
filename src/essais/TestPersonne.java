package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Dubois","Marc");
		Personne p2 = new Personne("Dupont", "Lisa", new AdressePostale(1,"rue de la paix",54444,"Lala"));
		
		
		System.out.println(p1);
		
		System.out.println(p2);
		
		//Dans la classe Personne, ajoutez une méthode qui prend un argument en paramètre et permet de modifier la variable d’instance nom de Personne.
		p2.changeNom("nouveau");
		System.out.println(p2);
		
		//autre methode pour modif nom
		p2.setNom("Durant");
		System.out.println(p2);
		
		//Dans la classe Personne, ajoutez une méthode similaire pour modifier le prénom.
		p2.changePrenom("LisaNew");
		System.out.println(p2);
		
		//Dans la classe Personne, ajoutez une méthode similaire pour modifier l’adresse.
		AdressePostale adrNew = new AdressePostale (18,"rue de Java",54445,"newville");
		p2.changeAdressePostale(adrNew);
		System.out.println(p2);
	}
}
