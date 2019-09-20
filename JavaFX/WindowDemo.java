import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class WindowDemo extends Application 
						implements EventHandler<ActionEvent>{

	Button buttonAdd;
	Button buttonClose;
	Button buttonClear;
	HBox mainLayout;
	Scene mainScene;
    Stage stage;
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;

		setUpButtons();
				
		HBox container = setUpHBox();
		
		mainLayout = new HBox();
		mainLayout.getChildren().add(container);
		
		mainScene = new Scene(mainLayout, mainLayout.getWidth(), 50);

		stage.setScene(mainScene);
		stage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		
		if(event.getSource()==buttonAdd){
			addCircle();			
		}
		else if(event.getSource()==buttonClear) {
			clearLayout();
		}
		else if(event.getSource()==buttonClose) {
			System.exit(0);
		}
		else {
			return;
		}
		
	}
	
	private void clearLayout() {
		mainLayout.getChildren().clear();
		mainLayout.getChildren().add(buttonAdd);
		mainLayout.getChildren().add(buttonClose);		
	}

	private void addCircle() {
		Circle circle = new Circle();
		circle.setFill(Color.CORNFLOWERBLUE);
		circle.setRadius(20);
		
		if(!mainLayout.getChildren().contains(buttonClear))
		{
			mainLayout.getChildren().add(buttonClear);
		}
		
		mainLayout.getChildren().add(circle);
	}

	private void setUpButtons()
	{
		buttonAdd = new Button("Add");		
		buttonAdd.setOnAction(this);
		
		buttonClear = new Button("Clear");		
		buttonClear.setOnAction(this);
		
		buttonClose = new Button("Close");		
		buttonClose.setOnAction(this);
	}
	
	private HBox setUpHBox()
	{
		HBox hBox = new HBox();
		hBox.getChildren().add(buttonAdd);
		hBox.getChildren().add(buttonClose);
		
		return hBox;
	}

}
