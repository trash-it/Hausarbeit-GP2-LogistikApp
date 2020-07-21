package view;

import java.io.File;

import controller.CTRL_Export;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class VIEW_Export {

	public static VBox getBox() { 
		VBox vbox = new VBox();
		Button btn_Export = new Button("Bestand exportieren");
		
		btn_Export.setOnAction( e -> {CTRL_Export.createFile(); CTRL_Export.exportFile();});
		
		vbox.getChildren().add(btn_Export);
		vbox.setPadding(new Insets(25, 0, 0, 100));
		return vbox;
	}

	public static Text getDescritptionText() {
		Text text = new Text();
		text.setText("Speicherort und Dateinamen wählen \n "
				+ "um den Bestand in eine importierbare \n "
				+ "TXT zu speichern");
		return text;	
	}
	
	public static Text getText() {
		Text text = new Text();
		text.setText("In Datei speichern");
		return text;
	}
}
