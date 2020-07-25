package view;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * The Class VIEW_Start.
 */
public class VIEWStart {

    /**
     * Gets Start VBox which is only used by the ProgramStart.
     *
     * @return the box
     */
    public static VBox getBox() {
        VBox vbox = new VBox();
        Text text = new Text(20, 40, "Willkommen. Bitte Funkton auswählen");
        vbox.getChildren().add(text);
        return vbox;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public static Text getText() {
        Text text = new Text();
        text.setText("Startmenü");
        return text;
    }

}
