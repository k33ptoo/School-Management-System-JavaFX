package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
//import jfxtras.styles.jmetro8.JMetro;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL home = getClass().getResource("/fxml/Home.fxml");
        assert home != null;
        System.out.println(home);
        Parent root = FXMLLoader.load(home);
        primaryStage.setTitle("KeepToo SMSys");
        primaryStage.getIcons().add(new Image("/icons/icon.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    //you can download the glyph browser - link provided.
    public static void main(String[] args) {
        launch(args);
    }
}
