package view;

import controller.CTRL_Export;
import controller.CTRL_Import;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class VIEW_Import {

	public static VBox getBox() { 
		VBox vbox = new VBox();
		Button btn_Import = new Button("Sicherungsdatei auswählen");
		
		btn_Import.setOnAction( e -> { CTRL_Import.deleteWaren(); CTRL_Import.chooseFile();});
		
		vbox.getChildren().add(btn_Import);
		vbox.setPadding(new Insets(25, 0, 0, 100));
		return vbox;
	}
	
	public static Text getDescritptionText() {
		Text text = new Text();
		text.setText("Speicherort der TXT auswählen \n"
				+ "ACHTUNG! \n"
				+ "Ein Import löscht den vorhanden \n"
				+ "Bestand");
		return text;	
	}

	public static Text getText() {
		Text text = new Text();
		text.setText("Bestand löschen und Sicherung einspielen");
		return text;
	}
}
