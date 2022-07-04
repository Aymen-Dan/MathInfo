package group.mathinfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TitleWindowController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void functionListBtnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setResizable(false);
        try {
            stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("buttonChoice.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void authorsBtnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setResizable(false);
        try {
            stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("authorsWindow.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
