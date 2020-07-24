package view;

import controller.CTRLImport;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

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
        Button btnImport = new Button("Sicherungsdatei auswählen");
        
        btnImport.setOnAction(e -> { CTRLImport.deleteWaren(); CTRLImport.chooseFile();});
        
        vbox.getChildren().add(btnImport);
        vbox.setPadding(new Insets(10, 0, 0, 50));
        return vbox;
    }
    
    /**
     * Gets the bottomBox .
     *
     * @return the bottomBox 
     */ 
    public static VBox getBottomBox() {
        VBox vbox = new VBox();
        vbox.getChildren().add(getDescriptionText()); 
        return  vbox;
    }
    
    /**
     * Gets the description text.
     *
     * @return the description text
     */
    public static Text getDescriptionText() {
        Text text = new Text();
        text.setText("Speicherort der TXT auswählen \n"
                + "ACHTUNG! \n"
                + "Ein Import löscht den vorhanden "
                + "Bestand");
        text.setTextAlignment(TextAlignment.CENTER);
        return text;	
    }

    /**
     * Gets the Statustext.
     *
     * @return the text
     */
    public static Text getStatusText() {
        Text text = new Text();
        text.setText("Bestand löschen und Sicherung einspielen");
        return text;
    }
}
