package view;

import controller.CTRLAdd;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


/**
 * The Class VIEW_Add.
 */
public class VIEWAdd {

    /**
     * Gets the VBox which all Textfields which describe an MODELWare Object.
     *
     * @return the box
     */
    public static VBox getCenterBox() { 
        VBox vbox = new VBox();
        Text txtartikel = new Text(20, 40, "Artikel:");
        Text txtanzahl = new Text(20, 40, "Anzahl: Nur Zahlen");
        Text txtgewicht = new Text(20, 40, "Gewicht: Nur Zahlen");      
        TextField tfartikel = new TextField();
        TextField tfanzahl = new TextField();
        TextField tfgewicht = new TextField();        
        CheckBox cbpalette = new CheckBox();
        cbpalette.setIndeterminate(true);        
        Button btnspeichern = new Button("Speichern");        
        btnspeichern.setOnAction(e -> CTRLAdd.actionButton(tfartikel.getText(), Integer.parseInt(tfanzahl.getText()), Float.parseFloat(tfgewicht.getText()), checkCheckbox(cbpalette))); 
        vbox.getChildren().addAll(txtartikel, tfartikel, txtanzahl, tfanzahl, txtgewicht, tfgewicht, cbpalette, btnspeichern);
        vbox.setPadding(new Insets(10, 0, 0, 50));
        return vbox;
    }   
    /**
     * Check checkbox for the palette.
     *
     * @param cbpalette the cb palette
     * @return true, if successful
     */
    private static boolean checkCheckbox(CheckBox cbpalette) {	
        return cbpalette.isSelected();
    }
	
    
    /**
     * Gets the bottomBox which descriptionText.
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
        text.setText("Bitte die Artikeldaten eingeben. \n"
                + "Gewicht bei Bedarf mit . trennen \n"
                + "Palettierbar auswählen: \n"
                + "für JA aktivieren für NEIN deaktivieren ");
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
        text.setText("Einlagern");
        return text;
    }
}
