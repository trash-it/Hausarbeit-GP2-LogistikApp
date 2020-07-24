package view;

import controller.CTRLExport;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

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
        Button btnExport = new Button("Bestand exportieren");
        
        btnExport.setOnAction(e -> {CTRLExport.createFile(); CTRLExport.exportFile();});
        
        vbox.getChildren().add(btnExport);
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
        text.setText("Speicherort und Dateinamen wählen "
                + "um den Bestand in eine importierbare \n "
                + "TXT zu speichern");
        text.setTextAlignment(TextAlignment.CENTER);
        return text;	
    }
    
    /**
     * Gets the Status text.
     *
     * @return the text
     */
    public static Text getStatusText() {
        Text text = new Text();
        text.setText("In Datei speichern");
        return text;
    }
}
