import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WindowLiveDemo extends Application implements EventHandler<ActionEvent> {

	Button knappen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		knappen = new Button("Ok!");
		knappen.setMinHeight(30);
		knappen.setMinWidth(30);
		knappen.setOnAction(this);
		
		Group root = new Group();
		
		root.setTranslateX(100);
		
		root.getChildren().add(knappen);
		
		Scene scene = new Scene(root, 200, 300);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if (event.getSource() == knappen)
		{
			System.out.println("hej!");
		}
		
	}

}
