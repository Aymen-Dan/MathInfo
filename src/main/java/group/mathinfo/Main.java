package group.mathinfo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        //stuff from graph main
     /*  Parent root = FXMLLoader.load(getClass().getResource("src/main/java/resources/group.mathInfo/sample.fxml"));
       Scene scene = new Scene(root, 700, 500);
        primaryStage.setTitle("Graph");
        primaryStage.setScene(scene);
        primaryStage.show();*/

        //Here we have just a basic hello world thing opening so I know that stuff works
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
