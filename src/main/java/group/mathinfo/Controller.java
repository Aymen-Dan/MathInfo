package group.mathinfo;

import java.io.File;
import java.io.IOException;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

//import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.SnapshotParameters;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;

public class Controller {

    private double calculateY_Graph1(double x, double constant) {
        return Math.sqrt(Math.pow(x, 3) / (constant - x));
    }


    private double calculateR_Graph2(){

        return 0;
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


/*

    @FXML
    private AnchorPane pane;

    @FXML
    private LineChart<Double, Double> lineGraph;

    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private TextField constantField;

    @FXML
    private TextField accuracyField;

    @FXML
    private TextField stepXField;

    @FXML
    private TextField stepYField;

    @FXML
    private TextField xLowerBoundField;

    @FXML
    private TextField xUpperBoundField;

    @FXML
    private Button drawFunctionBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button zoomInBtn;

    @FXML
    private Button zoomOutBtn;

    @FXML
    private Button resetZoomBtn;

    private double scaleX = 1;
    private double scaleY = 1;

    @FXML
    void initialize() {
        drawFunctionBtn.setOnAction(actionEvent -> {
            drawGraph();
            resize();
        });
        saveBtn.setOnAction(actionEvent -> {
         //   saveGraph();
        });
        zoomInBtn.setOnAction(actionEvent -> {
            scaleX *= 0.5;
            scaleY *= 0.5;
            resize();
        });
        zoomOutBtn.setOnAction(actionEvent -> {
            scaleX *= 2;
            scaleY *= 2;
            resize();
        });
        resetZoomBtn.setOnAction(actionEvent -> {
            scaleX = 1;
            scaleY = 1;
            resize();
        });
        stepXField.setOnAction(actionEvent -> {
            resize();
        });
        stepYField.setOnAction(actionEvent -> {
            resize();
        });
        constantField.textProperty().addListener((observableValue, s, t1) -> xUpperBoundField.setText(t1));

        constantField.setTextFormatter(makeTextFormatter("\\d*(\\.\\d*)?"));
        accuracyField.setTextFormatter(makeTextFormatter("\\d*(\\.\\d*)?"));
        xUpperBoundField.setTextFormatter(makeTextFormatter("\\d*(\\.\\d*)?"));
        xLowerBoundField.setTextFormatter(makeTextFormatter("\\d*(\\.\\d*)?"));
        stepXField.setTextFormatter(makeTextFormatter("\\d*"));
        stepYField.setTextFormatter(makeTextFormatter("\\d*"));
    }

    private void drawGraph() {
        if(lineGraph.getData().size() > 0) {
            lineGraph.getData().remove(0);
            lineGraph.getData().remove(0);
        }
        if(constantField.getText().length() == 0) {
            return;
        }
        double constantValue = Double.parseDouble(constantField.getText());

        if(accuracyField.getText().length() == 0) {
            accuracyField.setText("0.01");
        }
        double accuracy = Double.parseDouble(accuracyField.getText());

        if(xLowerBoundField.getText().length() == 0) {
            xLowerBoundField.setText("0");
        }
        double lowerBound = Double.parseDouble(xLowerBoundField.getText());

        if(xUpperBoundField.getText().length() == 0) {
            xUpperBoundField.setText(constantField.getText());
        }
        double upperBound = Double.parseDouble(xUpperBoundField.getText());

        if(upperBound > constantValue) {
            upperBound = constantValue;
        }

        XYChart.Series<Double, Double> seriesPositive = new XYChart.Series<>();
        for(double x = lowerBound; x < upperBound; x += accuracy) {
            seriesPositive.getData().add(new XYChart.Data<>(x, calculateY(x, constantValue)));
        }
        lineGraph.getData().add(seriesPositive);

        XYChart.Series<Double, Double> seriesNegative = new XYChart.Series<>();
        for(double x = lowerBound; x < upperBound; x += accuracy) {
            seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY(x, constantValue)));
        }
        lineGraph.getData().add(seriesNegative);
    }

    private double calculateY(double x, double constant) {
        return Math.sqrt(Math.pow(x, 3) / (constant - x));
    }

    private void resize() {
        if(stepXField.getText().length() == 0) {
            stepXField.setText("1");
        }
        if(stepYField.getText().length() == 0) {
            stepYField.setText("10");
        }

        int stepX = Integer.parseInt(stepXField.getText());
        int stepY = Integer.parseInt(stepYField.getText());

        xAxis.setLowerBound(-1 * stepX * scaleX);
        xAxis.setUpperBound(19 * stepX * scaleX);
        xAxis.setTickUnit(stepX * scaleX);
        yAxis.setLowerBound(-10 * stepY * scaleY);
        yAxis.setUpperBound(10 * stepY * scaleY);
        yAxis.setTickUnit(stepY * scaleY);
    }

   */
/* private void saveGraph() {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Файли png (*.png)", "*.png");
        fileChooser.getExtensionFilters().add(extFilter);

        File file = fileChooser.showSaveDialog(pane.getScene().getWindow());
        if(file != null) {
            saveGraphToFile(file);
        }
    }

    private void saveGraphToFile(File file) {
        WritableImage image = lineGraph.snapshot(new SnapshotParameters(), null);
        try {
            ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }*//*


    private TextFormatter makeTextFormatter(String regex) {
        Pattern pattern = Pattern.compile(regex);
        TextFormatter formatter = new TextFormatter((UnaryOperator<TextFormatter.Change>) change ->
                pattern.matcher(change.getControlNewText()).matches() ? change : null);
        return formatter;
    }
*/
}

