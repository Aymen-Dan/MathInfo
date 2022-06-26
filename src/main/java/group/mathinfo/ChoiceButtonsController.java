package group.mathinfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

public class ChoiceButtonsController implements Initializable {

    @FXML
    private Button graph1ButtonChoice;

    @FXML
    private Button graph2ButtonChoice;

    @FXML
    private Button graph3ButtonChoice;

    @FXML
    private Button graph4ButtonChoice;

    @FXML
    private Button graph5ButtonChoice;


private void callGraph() {
    try {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("graph.fxml"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
    @FXML
    private void handleChooseGraph1Action(final ActionEvent event) {

    }
    @FXML
    private void handleChooseGraph2Action(final ActionEvent event) {

    }
    @FXML
    private void handleChooseGraph3Action(final ActionEvent event) {

    }
    @FXML
    private void handleChooseGraph4Action(final ActionEvent event) {

    }
    @FXML
    private void handleChooseGraph5Action(final ActionEvent event) {

    }
    //return button action
    @FXML
    private void handleReturnButtonAction(final ActionEvent event) {
    goBack();
    }

    //return action
    private void goBack(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
