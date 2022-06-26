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



    //starts with button choice in my case, redo this to suit our actual needs please
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource("buttonChoice.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("JavaFX Graph");
            stage.show();
        } catch (Exception e) {
            System.out.print(e);
        }



    }
}

