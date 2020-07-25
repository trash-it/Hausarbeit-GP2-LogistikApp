/**
 * 
 */
package controller;

import view.LagerProgrammStart;

/**
 * The Class CTRLAdd.
 *
 * @author Jan Persch
 */
public class CTRLAdd {

    /**
     * Action button.
     *
     * @param name    the name of the article
     * @param anzahl  the anzahl of the article
     * @param gewicht the gewicht of the article
     * @param palette the palette boolean
     */
    public static void actionButton(String name, int anzahl, float gewicht, boolean palette) {
        LagerProgrammStart.addWare(name, anzahl, gewicht, palette);
    }
}
