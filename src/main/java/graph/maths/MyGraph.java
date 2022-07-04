package graph.maths;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import static java.lang.Math.*;


public class MyGraph {

    private LineChart<Number,Number> lineGraph;
    private double range;

    public MyGraph(final LineChart<Number, Number> lineGraph, final double range) {
         this.lineGraph = lineGraph;
        this.range = range;
    }


    private double calculateY1(double x, double constant) {
        return Math.sqrt(pow(x, 3) / (constant - x));
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
        return Math.sqrt(Math.sqrt(pow(constant,4)+4* pow(x,2)* pow(constant,2)) - pow(x, 2) - pow(constant, 2));
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
        return const1 * Math.sqrt(const2)* cos(const2);
    }
    private double calculateY3(double const1, double const2) {
        return const1 * Math.sqrt(const2)* sin(const2);
    }

    /**Ferma's spiral*/
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


    private double calculateX4(double const1, double const2, double theta) {
        return (const2 + const1*Math.cos(theta))*Math.cos(theta);
    }
    private double calculateY4(double const1, double const2, double theta) {
        return (const2+const1*Math.cos(theta))* sin(theta);
    }

    /**Limaçon*/
    public void plotLine4(final double paramA, final double paramB){

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        for(double theta = 0; theta <= range; theta = theta + 0.01) {
             series.getData().add(new XYChart.Data<>(calculateX4(paramA, paramB, theta), calculateY4(paramA, paramB, theta)));
        }

        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().add(series);
        lineGraph.setLegendVisible(false);

    }


    private double calculate5X(double const1, double t) {
        return 2*(cos(const1*t)- pow(cos(1*t),3));
    }
    private double calculate5Y(double const1,  double t) {
        return 2*(sin(const1*t)-pow(sin(1*t),3));
    }

    /**Graph x = 2(cos(A*t) - cos(1*t)^3) & 3 = 2(sin(C*t) - sin(1*t)^3)*/
    public void plotLine5(final double paramA, final double paramC) {
        XYChart.Series<Number, Number> seriesY1 = new XYChart.Series<>();

        for (double T = -range; T <= range; T = T + 0.01) {
            seriesY1.getData().add(new XYChart.Data<>(calculate5X(paramA,T), calculate5Y(paramC, T)));
        }

       lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().addAll(seriesY1);
        lineGraph.setLegendVisible(false);

    }

    //graph 6
    private double calculate6X(double const1, double t) {
        return 2*(Math.cos(1*t)- pow(Math.cos(const1*t),3));
    }
    private double calculate6Y(double const1, double t) {
        return 2*(sin(1*t)-2* pow(sin(const1*t),3));
    }

    /**Graph x = 2(cos(1*t) - cos(B*t)^3) & y = 2(sin(1*t) - sin(D*t)^3)*/
    public void plotLine6(final double paramB, final double paramD) {
        XYChart.Series<Number, Number> seriesY1 = new XYChart.Series<>();

        for (double T = -range; T <= range; T = T + 0.01) {
           seriesY1.getData().add(new XYChart.Data<>(calculate6X(paramB, T), calculate6Y(paramD, T)));
        }
        lineGraph.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        lineGraph.getData().addAll(seriesY1);
        lineGraph.setLegendVisible(false);
    }



    public void clear() {
        lineGraph.getData().clear();
    }
}