package graph.maths;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;


public class MyGraph {

    private LineChart<Number,Number> lineGraph;
    private double range;

    public MyGraph(final LineChart<Number, Number> lineGraph, final double range) {
         this.lineGraph = lineGraph;
        this.range = range;
    }


    private double calculateY1(double x, double constant) {
        return Math.sqrt(Math.pow(x, 3) / (constant - x));
    }


    /**Diocles Cissoid*/
    public void plotLine1(final double paramA) {
        XYChart.Series<Number, Number> seriesPositive = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesPositive.getData().add(new XYChart.Data<>(x, calculateY1(x, paramA)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(seriesPositive);
        lineGraph.setLegendVisible(false);

        XYChart.Series<Number, Number> seriesNegative = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY1(x, paramA)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(seriesNegative);
        lineGraph.setLegendVisible(false);
    }


    private double calculateY2(double x, double constant) {
        return Math.sqrt(Math.sqrt(Math.pow(constant,4)+4*Math.pow(x,2)*Math.pow(constant,2)) - Math.pow(x, 2) - Math.pow(constant, 2));
    }

    /**Lemniscate of Bernoulli*/
    public void plotLine2(final double paramA){
        XYChart.Series<Number, Number> seriesPositive = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesPositive.getData().add(new XYChart.Data<>(x, calculateY2(x, paramA)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(seriesPositive);
        lineGraph.setLegendVisible(false);


        XYChart.Series<Number, Number> seriesNegative = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY2(x, paramA)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(seriesNegative);
        lineGraph.setLegendVisible(false);
    }

    private double calculateX3(double const1, double const2) {
        return const1 * Math.sqrt(const2)*Math.cos(const2);
    }
    private double calculateY3(double const1, double const2) {
        return const1 * Math.sqrt(const2)*Math.sin(const2);
    }
    /**Ferma's spiral???*/
    public void plotLine3(final double paramA){

        XYChart.Series<Number, Number> seriesX = new XYChart.Series<>();
        for(double theta = 0; theta <= 15; theta = theta + 0.01) {
                seriesX.getData().add(new XYChart.Data<>(calculateX3(paramA,theta), calculateY3(paramA,theta)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(seriesX);
        lineGraph.setLegendVisible(false);

        XYChart.Series<Number, Number> seriesY = new XYChart.Series<>();
        for(double theta = 0; theta <= 15; theta = theta + 0.01) {
            seriesY.getData().add(new XYChart.Data<>(-calculateX3(paramA,theta), -calculateY3(paramA,theta)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(seriesY);
        lineGraph.setLegendVisible(false);
    }


    private double calculate4(double x, double const1, double const2, double const3) {
        return 0;
    }
    /**???*/
    public void plotLine4(final double paramA, final double paramB, final double paramC){

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            series.getData().add(new XYChart.Data<>(x, calculate4(x, paramA, paramB, paramC)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(series);
        lineGraph.setLegendVisible(false);



        XYChart.Series<Number, Number> seriesNegative = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            // seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY3(x, paramA, paramB)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(seriesNegative);
        lineGraph.setLegendVisible(false);
    }


    private double calculate5X(double const1, double const2, double t, double j) {
        return 2*(Math.cos(const1*t)-Math.pow(Math.cos(const2*t),j));
    }
    private double calculate5Y(double const1, double const2, double t, double k) {
        return 2*(Math.sin(const1*t)-2*Math.pow(Math.sin(const2*t),k));
    }
    /**Graph x = 2(cos(a*t) - cos(b*t)^j) & y = 2(sin(c*t) - sin(d*t)^k)*/
    public void plotLine5(final double paramA, final double paramB, final double paramC, final double paramD, final double paramJ, final double paramK) {
        XYChart.Series<Number, Number> seriesY1 = new XYChart.Series<>();

        for (double T = -range; T <= range; T = T + 0.01) {
            seriesY1.getData().add(new XYChart.Data<>(calculate5X(paramA, paramB, T, paramJ), calculate5Y(paramC, paramD, T, paramK)));
        }

       lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().addAll(seriesY1);
        lineGraph.setLegendVisible(false);

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
        lineGraph.getData().clear();
    }
}