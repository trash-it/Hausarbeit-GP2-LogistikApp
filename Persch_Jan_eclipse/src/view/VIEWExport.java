package view;

import java.io.File;

import controller.CTRLExport;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

// TODO: Auto-generated Javadoc
/**
 * The Class VIEW_Export.
 */
public class VIEWExport {

	/**
	 * Gets the box.
	 *
	 * @return the box
	 */
	public static VBox getBox() { 
		VBox vbox = new VBox();
		Button btn_Export = new Button("Bestand exportieren");
		
		btn_Export.setOnAction( e -> {CTRLExport.createFile(); CTRLExport.exportFile();});
		
		vbox.getChildren().add(btn_Export);
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
		text.setText("Speicherort und Dateinamen wählen \n "
				+ "um den Bestand in eine importierbare \n "
				+ "TXT zu speichern");
		return text;	
	}
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public static Text getText() {
		Text text = new Text();
		text.setText("In Datei speichern");
		return text;
	}
}
