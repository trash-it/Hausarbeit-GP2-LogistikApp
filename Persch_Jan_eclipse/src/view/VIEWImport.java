package view;

import controller.CTRLExport;
import controller.CTRLImport;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

// TODO: Auto-generated Javadoc
/**
 * The Class VIEW_Import.
 */
public class VIEWImport {

	/**
	 * Gets the box.
	 *
	 * @return the box
	 */
	public static VBox getBox() { 
		VBox vbox = new VBox();
		Button btn_Import = new Button("Sicherungsdatei auswählen");
		
		btn_Import.setOnAction( e -> { CTRLImport.deleteWaren(); CTRLImport.chooseFile();});
		
		vbox.getChildren().add(btn_Import);
		vbox.setPadding(new Insets(10, 0, 0, 50));
		return vbox;
	}
	
	/**
	 * Gets the descritption text.
	 *
	 * @return the descritption text
	 */
	public static Text getDescritptionText() {
		Text text = new Text();
		text.setText("Speicherort der TXT auswählen \n"
				+ "ACHTUNG! \n"
				+ "Ein Import löscht den vorhanden \n"
				+ "Bestand");
		return text;	
	}

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public static Text getText() {
		Text text = new Text();
		text.setText("Bestand löschen und Sicherung einspielen");
		return text;
	}
}
