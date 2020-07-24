package view;

import controller.CTRLTableController;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;



// TODO: Auto-generated Javadoc
/**
 * The Class VIEW_Change.
 */
public class VIEWChange {

    /**
     * Gets the box.
     *
     * @return the box
     */
    public static VBox getBox() { 
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 50 , 50 , 50));
        vbox.getChildren().add(CTRLTableController.getTable());
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
        text.setText("Zellen sind editierbar "
                + "Für Paletten true oder false eingeben \n"
                + "Mit Enter bestätigen");
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
        text.setText("Editiere Lagerbestand");
        return text;
    }

}
