/**
 * 
 */
package model;

import java.io.Serializable;

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
     * Instantiates a new MODELWareObject.
     *
     * @param name    the name of the article
     * @param anzahl  the anzahl of the article
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
     * Gets the amount.
     *
     * @return the amount
     */
    public int getAnzahl() {
        return anzahl;
    }

    /**
     * Gets the weight.
     *
     * @return the weight
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
     * Sets the article name.
     *
     * @param newArtikelName the new article name
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
     * Sets the article amount.
     *
     * @param newArtikelAnzahl the new article amount.
     */
    public void setArtikelAnzahl(Integer newArtikelAnzahl) {
        anzahl = newArtikelAnzahl;
    }

    /**
     * Sets the article weight.
     *
     * @param newArtikelGewicht the new article weight.
     */
    public void setArtikelGewicht(double newArtikelGewicht) {
        gewicht = newArtikelGewicht;
    }

}
