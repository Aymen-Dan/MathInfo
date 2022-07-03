package group.mathinfo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class InfoWindowContoller implements Initializable {

    @FXML
    private Label functionNameLabel;

    @FXML
    private TextArea functionInfoTextArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void setContents(String name, String info) {
        functionNameLabel.setText(name);
        functionInfoTextArea.setText(info);
    }
}
