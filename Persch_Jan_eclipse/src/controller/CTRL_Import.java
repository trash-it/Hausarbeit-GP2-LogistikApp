package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.stage.FileChooser;
import view.LagerProgrammStart;

public class CTRL_Import {



	public static void chooseFile() {
	       FileChooser fileChooser = new FileChooser();

		     
	        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
	        fileChooser.getExtensionFilters().add(extFilter);

	      
	        File file = fileChooser.showOpenDialog(LagerProgrammStart.getPrimaryStage());

	        if (file != null) {
	            createWaren(file);
	        }
		
	}

	public static void createWaren(File file) {
		try {
			Scanner scanner = new Scanner(file);
			//scanner.useDelimiter("#");
			
			while( scanner.hasNext()){
				
			
				String name = scanner.next();
				int anzahl = scanner.nextInt();
				double gewicht = Double.parseDouble(scanner.next());
				boolean palette = scanner.nextBoolean();
				System.out.print("\n Name: " + name + " \n Anzahl: " +  anzahl + "\n Gewicht: " + gewicht + "\n Palette:" + palette);
				view.LagerProgrammStart.addWare(name, anzahl, gewicht, palette);

			}
			 scanner.close(); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

	public static void deleteWaren() {
		LagerProgrammStart.getWarenliste().removeAll(LagerProgrammStart.getWarenliste());
		
	}

}
