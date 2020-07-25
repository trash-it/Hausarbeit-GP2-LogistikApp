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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
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
	    //create and set button positions    
        Button btn_showAll = new Button("Zeige Lagerbestand");
        Button btn_add = new Button("Einlagern");
        Button btn_change = new Button ("Ändere Artikel");
        Button btn_delete = new Button("Lösche Artikel");
        Button btn_exportToFile = new Button("Exportieren");
        Button btn_importFromFile = new Button("Imortieren");
            
        btn_showAll.setPadding(new Insets(10,10,10,10));
        btn_add.setPadding(new Insets(10,10,10,10));
        btn_change.setPadding(new Insets(10,10,10,10));
        btn_delete.setPadding(new Insets(10,10,10,10));
        btn_exportToFile.setPadding(new Insets(10,10,10,10));
        btn_importFromFile.setPadding(new Insets(10,10,10,10));
        //set buttonfunctions  
        btn_showAll.setOnAction(e -> {String string = "showAll";
            CTRLButtonController.actionButton(string); changeRoot(root); }); 
        btn_add.setOnAction(e -> {String string = "add";
            CTRLButtonController.actionButton(string); changeRoot(root); });
        btn_change.setOnAction(e -> {String string = "change";
            CTRLButtonController.actionButton(string); changeRoot(root); });
        btn_delete.setOnAction(e -> {String string = "delete";
            CTRLButtonController.actionButton(string); changeRoot(root); });
        btn_exportToFile.setOnAction(e -> {String string = "export";
            CTRLButtonController.actionButton(string); changeRoot(root); });
        btn_importFromFile.setOnAction(e -> {String string = "import";
            CTRLButtonController.actionButton(string); changeRoot(root); });
          
        VBox box_left = new VBox();
        box_left.setAlignment(Pos.CENTER);
        box_left.setPrefWidth(150);
        //set button width with the width from the leftbox   
        btn_showAll.setMinWidth(box_left.getPrefWidth());
        btn_add.setMinWidth(box_left.getPrefWidth());
        btn_change.setMinWidth(box_left.getPrefWidth());
        btn_delete.setMinWidth(box_left.getPrefWidth());
        btn_exportToFile.setMinWidth(box_left.getPrefWidth());
        btn_importFromFile.setMinWidth(box_left.getPrefWidth());
        box_left.getChildren().addAll(btn_showAll, btn_add, btn_change, btn_delete,
                btn_exportToFile, btn_importFromFile);
        root.setLeft(box_left);
        //set the logistic image to the box which will be added to the right pane
        Image image = new Image ("resources/lager.jpg");
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
     * Change center V box.
     *
     * @param box the box
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
     * Gets the warenliste.
     *
     * @return the warenliste
     */
    public static ObservableList<MODELWare> getWarenliste() {
        return data;
    }
	
	
    /**
     * Adds the ware.
     *
     * @param name the name
     * @param anzahl the anzahl
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
