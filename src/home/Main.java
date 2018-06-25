package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setTitle("KeepToo SMSys");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    //you can download the glyph browser - link provided.

    public static void main(String[] args) {
        launch(args);
    }
}
