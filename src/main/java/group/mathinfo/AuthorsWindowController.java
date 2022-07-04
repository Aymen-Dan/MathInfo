package group.mathinfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AuthorsWindowController  implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void handleReturnButtonAction(final ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        try {
            stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("titleWindow.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



