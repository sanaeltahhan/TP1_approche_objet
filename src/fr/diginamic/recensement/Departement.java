/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Departement
 * @author eltahhansana
 *
 */
public class Departement {
	
	/** code du département */
	private String code;
	
	/** population du département */
	private int population;
	
	/** liste des villes du département */
	private List<Ville> villes = new ArrayList<Ville>();

	/** Constructeur
	 * @param code
	 */
	public Departement(String code) {
		super();
		this.code = code;
	}
	
	/** Méthode qui ajoute une ville
	 * @param ville
	 */
	public void addVille(Ville ville) {
		villes.add(ville);
		this.population = this.population + ville.getPopulationTotale();
	}

	/** Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/** Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
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

	/** Getter
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/** Setter
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
	

}
