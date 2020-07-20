package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.collections.ObservableList;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import model.MODEL_Ware;
import view.LagerProgrammStart;

public class CTRL_Export {
	
	//static StringBuilder tempText = new StringBuilder();
	static String finalText;
	static ObservableList<MODEL_Ware> Waren = LagerProgrammStart.getWarenliste();
	
	
	public static void createFile() {
		StringBuilder tempText = new StringBuilder();
		
		for(MODEL_Ware artikel : Waren) {
			tempText.append(artikel.getName() + "\n" + String.valueOf(artikel.getAnzahl()) + "\n" + Double.toString(artikel.getGewicht()) + "\n" + artikel.isPalette() + "\n");
			tempText.append("\n");
		}
		finalText = tempText.toString();
	}
	
	public static void exportFile() {
        FileChooser fileChooser = new FileChooser();

        //Set extension filter for text files
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        //Show save file dialog
        File file = fileChooser.showSaveDialog(LagerProgrammStart.getPrimaryStage());

        if (file != null) {
            saveTextToFile(finalText, file);
        }

}

	private static void saveTextToFile(String finalText2, File file) {
		 try {
	            PrintWriter writer;
	            writer = new PrintWriter(file);
	            writer.println(finalText2);
	            writer.close();
	        } catch (IOException ex) {
	           System.out.println("CTRL_Export Fehler beim erstellen der Datei");
	        }
	    }
}
