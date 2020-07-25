package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import model.MODELWare;
import view.LagerProgrammStart;

/**
 * The Class CTRLExport.
 */
public class CTRLExport {

    /** the Text which will be written in the TXT. */
    static String finalText;
    /** The warenlist. */
    static ObservableList<MODELWare> waren = LagerProgrammStart.getWarenliste();

    /**
     * Creates the file.
     */
    public static void createFileText() {
        StringBuilder tempText = new StringBuilder();
        // tempText.append("StartOfFile" + "\n");
        for (MODELWare artikel : waren) {
            tempText.append(artikel.getName() + "\n" + String.valueOf(artikel.getAnzahl()) + "\n"
                    + Double.toString(artikel.getGewicht()) + "\n" + artikel.isPalette());
            tempText.append("\n");
        }
        // tempText.append("EndOfFile");
        finalText = tempText.toString();
    }

    /**
     * Export file.
     */
    public static void exportFile() {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showSaveDialog(LagerProgrammStart.getPrimaryStage());
        if (file != null) {
            saveTextToFile(finalText, file);
        }
    }

    /**
     * Save text to file.
     *
     * @param writableText the text for the txt
     * @param file the export txt file
     */
    private static void saveTextToFile(String writableText, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(writableText);
            writer.close();
        } catch (IOException ex) {
            System.out.println("CTRL_Export Fehler beim erstellen der Datei");
        }
    }
}
