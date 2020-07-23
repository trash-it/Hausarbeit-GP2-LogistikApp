/**
 * 
 */
package model;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class MODEL_Ware.
 *
 * @author Jan Persch
 */
public class MODELWare implements Serializable {
	
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /** The name. */
    private String name;
    /** The anzahl. */
    private int anzahl;
    /** The gewicht. */
    private double gewicht;
    /** The palette. */
    private boolean palette;
    
    /**
     * Instantiates a new MODELWare.
     *
     * @param name the name of the article
     * @param anzahl the anzahl of the article
     * @param gewicht the gewicht of the article
     * @param palette the palette boolean
     */
    public MODELWare(String name, int anzahl, double gewicht, boolean palette) {
        this.name = name;
	this.anzahl = anzahl; 
	this.gewicht = gewicht;
	this.palette = palette;
    }


    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the anzahl.
     *
     * @return the anzahl
     */
    public int getAnzahl() {
        return anzahl;
    }
	
    /**
     * Gets the gewicht.
     *
     * @return the gewicht
     */
    public double getGewicht() {
        return gewicht;
    }
	
    /**
     * Checks if is palette.
     *
     * @return true, if is palette
     */
    public boolean isPalette() {
        return palette;
    }

    /**
     * Sets the artikel name.
     *
     * @param newArtikelName the new artikel name
     */
    public void setArtikelName(String newArtikelName) {
        name = newArtikelName;
    }
    
    /**
     * Sets the palette boolean.
     *
     * @param value the new palette
     */
    public void setPalette(boolean value) {
        palette = value;
    }

    /**
     * Sets the artikel anzahl.
     *
     * @param newArtikelAnzahl the new artikel anzahl
     */
    public void setArtikelAnzahl(Integer newArtikelAnzahl) {
        anzahl = newArtikelAnzahl;
    }

    /**
     * Sets the artikel gewicht.
     *
     * @param newArtikelGewicht the new artikel gewicht
     */
    public void setArtikelGewicht(double newArtikelGewicht) {
        gewicht = newArtikelGewicht;	
    }
	


	
}
