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

public class ChoiceButtonsController implements Initializable {

    @FXML
    private AnchorPane rootPane;



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

    @FXML
    private Button graph6ButtonChoice;



    @FXML
    private void callGraph1() throws IOException {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("graph1.fxml"));

            rootPane.getChildren().setAll(pane);

    }
    @FXML
    private void callGraph2() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("graph2.fxml"));

        rootPane.getChildren().setAll(pane);
    }
    @FXML
    private void callGraph3() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("graph3.fxml"));

        rootPane.getChildren().setAll(pane);
    }
    @FXML
    private void callGraph4() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("graph4.fxml"));

        rootPane.getChildren().setAll(pane);
    }
    @FXML
    private void callGraph5() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("graph5.fxml"));

        rootPane.getChildren().setAll(pane);
    }

    @FXML
    private void callGraph6() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("graph6.fxml"));

        rootPane.getChildren().setAll(pane);
    }


    @FXML
    private void handleChooseGraph1Action(final ActionEvent event) throws IOException {
        callGraph1();
    }
    @FXML
    private void handleChooseGraph2Action(final ActionEvent event) throws IOException {
     callGraph2();
    }
    @FXML
    private void handleChooseGraph3Action(final ActionEvent event) throws IOException {
        callGraph3();
    }
    @FXML
    private void handleChooseGraph4Action(final ActionEvent event) throws IOException {
        callGraph4();
    }
    @FXML
    private void handleChooseGraph5Action(final ActionEvent event)  throws IOException {
        callGraph5();
    }
    @FXML
    private void handleChooseGraph6Action(final ActionEvent event)  throws IOException {
        callGraph6();
    }




    //return button action
    @FXML
    private void handleReturnButtonAction(final ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("titleWindow.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
