package group.mathinfo;

import graph.maths.Graph1_;
import graph.maths.Graph2_ASpiral;
import graph.maths.MyGraph;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

public class Graph1Controller implements Initializable {

    private void Graph1(double x, double constant) {
        new Graph1_();
    }


    private void Graph2(){
      new Graph2_ASpiral();
    }

    private double calculateY_Graph3(){

        return 0;
    }

    private double calculateY_Graph4(){

        return 0;
    }

    private double calculateY_Graph5(){

        return 0;
    }


    @FXML
    private AnchorPane rootPane;


    @FXML
    private AreaChart<Double, Double> areaGraph;

    @FXML
    private Button graph1Button;

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
    private TextArea textArea1;

    @FXML
    private Label label2;
    @FXML
    private TextArea textArea2;


    @FXML
    private HBox hb;

    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
      //  mathsGraph = new MyGraph(lineGraph, 10);
        areaMathsGraph = new MyGraph(areaGraph, 10);
    }


    private void plotLine(Function<Double, Double> function) {
        areaMathsGraph.plotLine(function);
    }

    @FXML
    private void handleGraph1ButtonAction(final ActionEvent event) {
        plotLine(x -> x);
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

    }

    private void clear() {
       /* if (lineGraph.isVisible()) {
            mathsGraph.clear();
        } else {
            areaMathsGraph.clear();
        }*/
        areaMathsGraph.clear();

    }
}

