/**
 * 
 */
package view;

import controller.CTRL_ButtonController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.MODEL_WarenListe;

/**
 * @author Jan Persch
 *
 */
public class LagerProgrammStart extends Application {
	
	static VBox box_center = VIEW_Start.getBox();
	static Text statusText = new Text();
	static MODEL_WarenListe warenliste;


	
	@Override 
	public void start(Stage primaryStage) {
		statusText.setText("Startmenü");
		warenliste = new MODEL_WarenListe();
		utilities.createOneListEntry.createTestEntry();
		utilities.initialHelper.createShowAllTable();
			
		
			BorderPane root = new BorderPane();
			
			
            Label top = new Label("label top");
            top.setPadding(new Insets(25, 25, 25, 25));
            root.setTop(top);
            
            Label left = new Label("label left");
            left.setPadding(new Insets(25, 25, 25, 25));
            root.setLeft(left);
            
            Label right = new Label("label right");
            right.setPadding(new Insets(25, 25, 25, 25));
            root.setRight(right);
            
            Label center = new Label("label center");
            center.setPadding(new Insets(25, 25, 25, 25));
            root.setCenter(center); 
            
            Label bottom = new Label("label bottom");
            bottom.setPadding(new Insets(25, 25, 25, 25));
            root.setBottom(bottom);         
            
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
            
            btn_showAll.setOnAction(e -> {String string = "showAll"; CTRL_ButtonController.actionButton(string); changeRoot(root); }); 
            btn_add.setOnAction(e -> {String string = "add"; CTRL_ButtonController.actionButton(string); changeRoot(root); });
            btn_change.setOnAction(e -> {String string = "change"; CTRL_ButtonController.actionButton(string); changeRoot(root); });
            btn_delete.setOnAction(e -> {String string = "delete"; CTRL_ButtonController.actionButton(string); changeRoot(root); });
            btn_exportToFile.setOnAction(e -> {String string = "export"; CTRL_ButtonController.actionButton(string); changeRoot(root); });
            btn_importFromFile.setOnAction(e -> {String string = "import"; CTRL_ButtonController.actionButton(string); changeRoot(root); });
            
            VBox box_left = new VBox();
            box_left.setAlignment(Pos.CENTER);
            box_left.setPrefWidth(150);
            
            btn_showAll.setMinWidth(box_left.getPrefWidth());
            btn_add.setMinWidth(box_left.getPrefWidth());
            btn_change.setMinWidth(box_left.getPrefWidth());
            btn_delete.setMinWidth(box_left.getPrefWidth());
            btn_exportToFile.setMinWidth(box_left.getPrefWidth());
            btn_importFromFile.setMinWidth(box_left.getPrefWidth());
            box_left.getChildren().addAll(btn_showAll, btn_add, btn_change, btn_delete, btn_exportToFile, btn_importFromFile);
            root.setLeft(box_left);
         
            
            
            box_center.setAlignment(Pos.TOP_CENTER);
            // Text text_center = new Text();
            // text_center.setText("Bitte die gewünschte Funktion auswählen");
            root.setTop(statusText);
            root.setCenter(box_center);
            
            
            
            Scene scene = new Scene(root, 800,600);
            
            primaryStage.setTitle("Lagerprogramm Persch-Logistik");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            
	}
	
	
	public static void changeCenterVBox(VBox box) {
		box_center = box;


	}
	
	public static void changeStatusText(Text text) {
		statusText = text;
		
	}
	
	private void changeRoot(BorderPane root) {
		box_center.setAlignment(Pos.CENTER_LEFT);
		root.setCenter(box_center);
		root.setTop(statusText);
	}
	
	public static MODEL_WarenListe getWarenliste() {
		return warenliste;
	}
	
	
	public static void addWare(String name, int anzahl, double gewicht, boolean palette) {
		System.out.println("LagerProgrammStart addware");
		warenliste.addWare(name, anzahl, gewicht, palette);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 launch(args);

	}




}
