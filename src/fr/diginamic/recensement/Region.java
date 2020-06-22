/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe région
 * @author eltahhansana
 *
 */
public class Region {
	
	/** nom de la région */
	private String nom;
	/** code d'une région */
	private int code;
	/** population d'une région */
	private int population;
	
	/** villes : List<Ville>*/
	private List<Ville> villes = new ArrayList<>();
	
	/** Constructeur
	 * @param nom
	 * @param code
	 */
	public Region(String nom, int code) {
		super();
		this.nom = nom;
		this.code = code;
		
	}
	
	/** Méthode qui ajoute une ville
	 * @param ville ville
	 */
	public void addVille(Ville ville){
		villes.add(ville);
		this.population=this.population+ville.getPopulationTotale();
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/** Setter
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/** Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/** Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	
	
	

}
