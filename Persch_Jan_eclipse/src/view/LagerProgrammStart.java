/**
 * 
 */
package view;

import controller.CTRLButtonController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.MODELWare;

/**
 * The Class LagerProgrammStart.
 *
 * @author Jan Persch
 */
public class LagerProgrammStart extends Application {

    /** The box center. */
    static VBox boxcenter = VIEWStart.getBox();
    /** The box bottom. */
    static VBox boxbottom = new VBox();
    /** The status text. */
    static Text statusText = new Text();
    /** The data. */
    static ObservableList<MODELWare> data;
    /** The p stage. */
    private static Stage pStage;
    /** The description text. */
    private static Text descriptionText = new Text();

    /**
     * Start.
     *
     * @param primaryStage the primary stage
     */
    @Override
    public void start(Stage primaryStage) {
        statusText.setText("Startmenü");
        data = FXCollections.observableArrayList();
        utilities.CreateTestListEntry.createTestEntry();
        utilities.InitialHelper.createShowAllTable();
        BorderPane root = new BorderPane();
        BorderPane.setMargin(statusText, new Insets(10, 10, 10, 10));
        // create and set button positions
        Button btnshowAll = new Button("Zeige Lagerbestand");
        Button btnadd = new Button("Einlagern");
        Button btnchange = new Button("Ändere Artikel");
        Button btndelete = new Button("Lösche Artikel");
        Button btnexportToFile = new Button("Exportieren");
        Button btnimportFromFile = new Button("Imortieren");

        btnshowAll.setPadding(new Insets(10, 10, 10, 10));
        btnadd.setPadding(new Insets(10, 10, 10, 10));
        btnchange.setPadding(new Insets(10, 10, 10, 10));
        btndelete.setPadding(new Insets(10, 10, 10, 10));
        btnexportToFile.setPadding(new Insets(10, 10, 10, 10));
        btnimportFromFile.setPadding(new Insets(10, 10, 10, 10));
        // set buttonfunctions
        btnshowAll.setOnAction(e -> {
            String string = "showAll";
            CTRLButtonController.actionButton(string);
            changeRoot(root);
        });
        btnadd.setOnAction(e -> {
            String string = "add";
            CTRLButtonController.actionButton(string);
            changeRoot(root);
        });
        btnchange.setOnAction(e -> {
            String string = "change";
            CTRLButtonController.actionButton(string);
            changeRoot(root);
        });
        btndelete.setOnAction(e -> {
            String string = "delete";
            CTRLButtonController.actionButton(string);
            changeRoot(root);
        });
        btnexportToFile.setOnAction(e -> {
            String string = "export";
            CTRLButtonController.actionButton(string);
            changeRoot(root);
        });
        btnimportFromFile.setOnAction(e -> {
            String string = "import";
            CTRLButtonController.actionButton(string);
            changeRoot(root);
        });

        VBox boxleft = new VBox();
        boxleft.setAlignment(Pos.CENTER);
        boxleft.setPrefWidth(150);
        // set button width with the width from the leftbox
        btnshowAll.setMinWidth(boxleft.getPrefWidth());
        btnadd.setMinWidth(boxleft.getPrefWidth());
        btnchange.setMinWidth(boxleft.getPrefWidth());
        btndelete.setMinWidth(boxleft.getPrefWidth());
        btnexportToFile.setMinWidth(boxleft.getPrefWidth());
        btnimportFromFile.setMinWidth(boxleft.getPrefWidth());
        boxleft.getChildren().addAll(btnshowAll, btnadd, btnchange, btndelete, btnexportToFile,
                btnimportFromFile);
        root.setLeft(boxleft);
        // set the logistic image to the box which will be added to the right pane
        Image image = new Image("resources/lager.jpg");
        ImageView imgView = new ImageView(image);
        imgView.setImage(image);
        Rectangle2D viewport = new Rectangle2D(0, 80, 200, 425);
        imgView.setViewport(viewport);
        VBox boxright = new VBox();
        boxright.getChildren().add(imgView);
        boxright.setPadding(new Insets(20, 25, 25, 25));

        boxcenter.setAlignment(Pos.TOP_CENTER);
        root.setTop(statusText);
        root.setRight(boxright);
        root.setCenter(boxcenter);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Lagerprogramm Persch-Logistik");
        primaryStage.setScene(scene);
        primaryStage.show();
        pStage = primaryStage;

    }

    /**
     * Change center VBox.
     *
     * @param box1 the centerbox
     * @param box2 the bottombox
     */
    public static void changeVBox(VBox box1, VBox box2) {
        boxbottom = box2;
        boxcenter = box1;
    }

    /**
     * Change the status text.
     *
     * @param text the status text
     */
    public static void changeStatusText(Text text) {
        statusText = text;
    }

    /**
     * Change root.
     *
     * @param root the root Stage
     */
    private void changeRoot(BorderPane root) {
        boxcenter.setAlignment(Pos.CENTER_LEFT);

        root.setCenter(boxcenter);
        root.setTop(statusText);
        boxbottom.setAlignment(Pos.TOP_CENTER);
        root.setBottom(boxbottom);

        BorderPane.setMargin(statusText, new Insets(10, 10, 10, 10));
    }

    /**
     * Gets the warenliste which includes all articles.
     *
     * @return the warenliste
     */
    public static ObservableList<MODELWare> getWarenliste() {
        return data;
    }

    /**
     * Adds the an article to the warenliste.
     *
     * @param name    the name
     * @param anzahl  the anzahl
     * @param gewicht the gewicht
     * @param palette the palette
     */
    public static void addWare(String name, int anzahl, double gewicht, boolean palette) {
        // System.out.println("LagerProgrammStart addware");
        data.add(new MODELWare(name, anzahl, gewicht, palette));
    }

    /**
     * Gets the primary stage.
     *
     * @return the primary stage
     */
    public static Stage getPrimaryStage() {
        return pStage;
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
