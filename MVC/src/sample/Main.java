package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("sample.fxml"))));
        primaryStage.setTitle("Paint over 9000");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
