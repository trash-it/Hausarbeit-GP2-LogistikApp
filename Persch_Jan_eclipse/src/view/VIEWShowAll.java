package view;

import controller.CTRLTableController;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * The Class VIEW_ShowAll.
 */
public class VIEWShowAll {
	
    /**
     * Gets the box.
     *
     * @return the box
     */
    public static VBox getBox() { 
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 50 , 50, 50));
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
        vbox.getChildren().add(getDescritptionText()); 
        return  vbox;
    }
    
    /**
     * Gets the descritption text.
     *
     * @return the descritption text
     */
    public static Text getDescritptionText() {
        Text text = new Text();
        text.setText("Auflistung des "
                + "Lagerbestands");
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
        text.setText("Zeige Lagerbestand");
        return text;
    }

}
