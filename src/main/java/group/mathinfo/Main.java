package group.mathinfo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource("titleWindow.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("JavaFX Graph Example");
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.print(e);
        }


    }
}

