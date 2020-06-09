/**
 * 
 */
package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Jan Persch
 *
 */
public class LagerProgrammStart extends Application {


	
	@Override 
	public void start(Stage primaryStage) {
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
         
            VBox box_center = new VBox();
            box_center.setAlignment(Pos.TOP_LEFT);
            Text text_center = new Text();
            text_center.setText("Bitte die gewünschte Funktion auswählen");
            box_center.getChildren().add(text_center);
            root.setCenter(box_center);
            
            
            Scene scene = new Scene(root, 800,600);
            
            primaryStage.setTitle("Lager Übersicht");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 launch(args);

	}

}
