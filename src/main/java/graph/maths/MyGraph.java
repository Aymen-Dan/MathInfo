package graph.maths;

import javafx.scene.chart.XYChart;

public class MyGraph {

    private XYChart<Double, Double> graph;
    private double range;

    public MyGraph(final XYChart<Double, Double> graph, final double range) {
        this.graph = graph;
        this.range = range;
    }




    private double calculateY1(double x, double constant) {
        return Math.sqrt(Math.pow(x, 3) / (constant - x));
    }


    /**Diocles Cissoid*/
    public void plotLine1(final double paramA) {
        XYChart.Series<Double, Double> seriesPositive = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesPositive.getData().add(new XYChart.Data<>(x, calculateY1(x, paramA)));
        }
        graph.getData().add(seriesPositive);

        XYChart.Series<Double, Double> seriesNegative = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY1(x, paramA)));
        }
        graph.getData().add(seriesNegative);
    }


    private double calculateY2(double x, double constant) {
        return Math.sqrt(Math.sqrt(Math.pow(constant,4)+4*Math.pow(x,2)*Math.pow(constant,2)) - Math.pow(x, 2) - Math.pow(constant, 2));
    }

    /**Lemniscate of Bernoulli*/
    public void plotLine2(final double paramA){

        XYChart.Series<Double, Double> seriesPositive = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesPositive.getData().add(new XYChart.Data<>(x, calculateY2(x, paramA)));
        }
        graph.getData().add(seriesPositive);

        XYChart.Series<Double, Double> seriesNegative = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesPositive.getData().add(new XYChart.Data<>(x, -calculateY2(x, paramA)));
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