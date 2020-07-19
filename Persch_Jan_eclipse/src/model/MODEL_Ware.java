/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author Jan Persch
 *
 */
public class MODEL_Ware implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int anzahl;
	private double gewicht;
	private boolean palette;
	
	public MODEL_Ware(String name, int anzahl, double gewicht, boolean palette) {
	
		this.name = name;
		this.anzahl = anzahl; 
		this.gewicht = gewicht;
		this.palette = palette;
			
	}

	
	
	public String getName() {
		return name;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public double getGewicht() {
		return gewicht;
	}
	public boolean isPalette() {
		return palette;
	}



	public void setArtikelName(String newArtikelName) {
		name = newArtikelName;
		
	}
	


	
}
