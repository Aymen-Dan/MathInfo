package group.mathinfo;

import graph.maths.MyGraph;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

public class GraphScreenController implements Initializable {



    @FXML
    private LineChart<Double, Double> lineGraph;

    @FXML
    private Button graph1Button;
    @FXML
    private Button graph2Button;
    @FXML
    private Button graph3Button;
    @FXML
    private Button graph4Button;
    @FXML
    private Button graph5Button;


    @FXML
    private Button infoButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button clearButton;

    private MyGraph areaMathsGraph;

    @FXML
    private Label label1;
    @FXML
    private TextField textField1;

    @FXML
    private Label label2;
    @FXML
    private TextField textField2;

    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        areaMathsGraph = new MyGraph(lineGraph, 10);
    }

    @FXML
    private void handleGraph1ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        areaMathsGraph.plotLine1(a);
    }

    @FXML
    private void handleGraph2ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        //double b = Double.parseDouble(textField1.getText());
        //areaMathsGraph.plotLine1( a);
        //areaMathsGraph.plotLine1( b);
    }
    @FXML
    private void handleGraph3ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        //double b = Double.parseDouble(textField1.getText());
        //areaMathsGraph.plotLine1( a);
        //areaMathsGraph.plotLine1( b);
    }
    @FXML
    private void handleGraph4ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        //double b = Double.parseDouble(textField1.getText());
        //areaMathsGraph.plotLine1( a);
        //areaMathsGraph.plotLine1( b);
    }
    @FXML
    private void handleGraph5ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        //double b = Double.parseDouble(textField1.getText());
        //areaMathsGraph.plotLine1( a);
        //areaMathsGraph.plotLine1( b);
    }


    @FXML
    private void handleInfoButtonAction(final ActionEvent event) {
        final Stage infoWindow = new Stage();
        infoWindow.initModality(Modality.NONE);
        infoWindow.initOwner(((Node) event.getSource()).getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            infoWindow.setScene(new Scene(fxmlLoader.load(getClass().getResource("infoWindow.fxml").openStream())));

        } catch (IOException e) {
            e.printStackTrace();
        }
        infoWindow.show();
        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Функція", "Опис функції");
    }

    @FXML
    private void handleClearButtonAction(final ActionEvent event) {
        clear();
    }
    @FXML
    private void handleReturnButtonAction(final ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("buttonChoice.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        areaMathsGraph.clear();

    }
}

