package group.mathinfo;

import graph.maths.Graph1_;
import graph.maths.Graph2_ASpiral;
import graph.maths.MyGraph;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

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
    private Button graph2Button;

    @FXML
    private Button graph3Button;

    @FXML
    private Button graph4Button;

    @FXML
    private Button graph5Button;

    @FXML
    private Button returnButton;

    @FXML
    private Button clearButton;


    private MyGraph areaMathsGraph;

    @FXML
    private Label label1;
    @FXML
    private Label label2;

    @FXML
    private HBox hb;

    private void createLabel1(){
        label1 = new Label("Name:");
        TextField textField = new TextField ();
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField);
        hb.setSpacing(10);
    }

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
    private void handleGraph2ButtonAction(final ActionEvent event) {
       // plotLine(x -> x - 3);
    }

    @FXML
    private void handleGraph3ButtonAction(final ActionEvent event) {

    }

    @FXML
    private void handleGraph4ButtonAction(final ActionEvent event) {

    }

    @FXML
    private void handleGraph5ButtonAction(final ActionEvent event) {

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

