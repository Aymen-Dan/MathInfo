package graph.maths;

import javafx.scene.chart.XYChart;

import java.util.function.Function;

import static java.lang.Math.PI;

public class MyGraph {

    private XYChart<Double, Double> graph;
    private double range;

    public MyGraph(final XYChart<Double, Double> graph, final double range) {
        this.graph = graph;
        this.range = range;
    }




    private double calculateY(double x, double constant) {
        return Math.sqrt(Math.pow(x, 3) / (constant - x));
    }


    /**A more complicated plotLine method. Use it for both the X and the Y, use parameters as x and z.*/
    public void plotLine1(final double paramA) {
/* //translate paramB to radians
        final double bInRad = paramB * PI / 180;
        //use a and b to calculate graph1 x
        final double x = 2*paramA*Math.pow(Math.sin(bInRad), 2);
        //use a and b to calculate graph1 y
        final double y = (2 * paramA * Math.pow(Math.sin(bInRad),3))/Math.cos(bInRad);*/
        XYChart.Series<Double, Double> seriesPositive = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesPositive.getData().add(new XYChart.Data<>(x, calculateY(x, paramA)));
        }
        graph.getData().add(seriesPositive);

        XYChart.Series<Double, Double> seriesNegative = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY(x, paramA)));
        }
        graph.getData().add(seriesNegative);
    }


    /*public void plotLine(final Function<Double, Double> function) {
        final XYChart.Series<Double, Double> series = new XYChart.Series<Double, Double>();
        for (double x = -range; x <= range; x = x + 0.01) {
            plotPoint(x, function.apply(x), series);
        }
        graph.getData().add(series);
    }

    private void plotPoint(final double x, final double y,
                           final XYChart.Series<Double, Double> series) {
        series.getData().add(new XYChart.Data<Double, Double>(x, y));
    }
*/
    public void clear() {
        graph.getData().clear();
    }
}