package utilities;

public class createOneListEntry {
	
	final static String name = "TestEins";
	final static int anzahl = 10;
	final static double gewicht = 15.5;
	final static boolean palette = true;

	public static void createTestEntry(){
		System.out.println("Erstelle Testeintrag");
		view.LagerProgrammStart.addWare(name, anzahl, gewicht , palette);
		view.LagerProgrammStart.addWare("TEST2", 2, 22.22 , false);
	}

}
