/**
 * 
 */
package fr.diginamic.maison;

/**
 * Classe Maison
 * 
 * @author eltahhansana
 *
 */
public class Maison {
	
	/** Tableau d'objet de type piece*/
	private Piece[] tabPiece;

	/**
	 * Constructeur
	 */
	public Maison() {
		// Initialisation du tableau de pièces
		tabPiece = new Piece[0];
	}
	
	/**Methode qui permet d'ajouter une pièce à la maison
	 * @param array: tableau de Piece où l'on souhaite ajouter un élément 
	 * @param piece: la piece a ajouté au tableau
	 */
	public void ajouterPiece(Piece pieceAjoute) {
		
		
		// Test de verification que les données ajoutées sont illigibles
		if (pieceAjoute != null && pieceAjoute.getSuperficie() > 0 && pieceAjoute.getEtage() >= 0) {
			
			// Création d'un tableau temporaire qui fait la taille du tableau initial + 1
			Piece[] tempTab = new Piece[tabPiece.length+1];
			
			// Transfert des element du tableau tabPiece au tableau tempTab
			for(int i=0; i < tabPiece.length; i++) {
				tempTab[i] = tabPiece[i];
			}
			
			// Ajout du nouveau element (piece) à la fin du tableau
			tempTab[tempTab.length - 1] = pieceAjoute;
			
			// Affectation du tableau tempTab à tabPiece (tableau initial)
			tabPiece = tempTab;
			
			System.out.println("Votre pièce a été ajouté !");
			
		}else {
			
			System.out.println("Votre demande est incorrecte ! ");
			
		}
		
	}

		
	/**
	 * Méthode qui calcule la superficie totale de la maison
	 * @return double : retourne le superficie total de la maison
	 */
	public double superficieTotal() {
		double superficieTotal = 0;
		for (int i=0; i<tabPiece.length; i++) {
			superficieTotal = superficieTotal + tabPiece[i].getSuperficie();
		}
		return superficieTotal;
	}
	
	/**
	 * Méthode qui calcule la superficie d'un étage donné en paramètre
	 * @param etage : représente l'étage de la maison pour lequel nous voulons la superficie
	 * @return double : retourne la superficie d'un étage donné
	 */
	public double superficeEtage(int etage) {
		double superficieEtage = 0;
		for (int i=0; i<tabPiece.length; i++) {
			if (etage == tabPiece[i].getEtage()) {
				superficieEtage = superficieEtage + tabPiece[i].getSuperficie();
			}	
		}
		return superficieEtage;	
	}
	
	/** 
	 * Méthode qui calcule la superficie d'un type de pièce donné
	 * @param typePiece : représente le type de pièce ex: chambre, WC...
	 * @return double
	 */
	public double superficieType (String typePiece) {
		double superficieType = 0;
		for (int i=0; i<tabPiece.length; i++) {
			if (typePiece == tabPiece[i].getType()) {
				superficieType = superficieType + tabPiece[i].getSuperficie();
			}	
		}
		return superficieType;	
		
	}
	
	/** 
	 * Méthode qui cqlcule le nombre de pièce d'un type donné
	 * @param typePiece : Représente le type de pièce 
	 * @return int : retourne le nombre de pièce
	 */
	public int nbrPiece (String typePiece) {
		int nbrPiece = 0;
		for (int i=0; i<tabPiece.length; i++) {
			if (typePiece == tabPiece[i].getType()) {
				nbrPiece = nbrPiece + 1;
			}	
		}
		return nbrPiece;	
	}

	

}
