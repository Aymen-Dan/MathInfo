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
            stage.setScene(new Scene(root));
            stage.setTitle("JavaFX Graph Example");
            stage.show();
        } catch (Exception e) {
            System.out.print(e);
        }


        //stuff from graph main
     /*  Parent root = FXMLLoader.load(getClass().getResource("src/main/java/resources/group.mathInfo/buttonChoice.fxml"));
       Scene scene = new Scene(root, 700, 500);
        primaryStage.setTitle("Graph");
        primaryStage.setScene(scene);
        primaryStage.show();*/

        //Here we have just a basic hello world thing opening so I know that stuff works
        /*FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("buttonChoice.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        primaryStage.setTitle("Hello!");

        primaryStage.setScene(scene);

        primaryStage.show();*/


    }
}

