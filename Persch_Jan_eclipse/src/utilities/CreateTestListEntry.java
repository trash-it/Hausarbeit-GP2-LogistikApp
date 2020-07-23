package utilities;


/**
 * The Class createOneListEntry.
 */
public class CreateTestListEntry {

    /** The Constant NAME. */
    static final String NAME = "TestEins";
    /** The Constant ANZAHL. */
    static final int ANZAHL = 1;
    /** The Constant GEWICHT. */
    static final double GEWICHT = 11115;
    /** The Constant PALETTE. */
    static final boolean PALETTE = true;

    /**
     * Creates the test entries.
     */
    public static void createTestEntry() {
        System.out.println("Erstelle Testeintrag");
        view.LagerProgrammStart.addWare(NAME, ANZAHL, GEWICHT , PALETTE);
        view.LagerProgrammStart.addWare("TESTZwei", 2, 22.22 , false);
    }

}
