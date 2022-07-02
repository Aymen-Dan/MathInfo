package graph.maths;

import javafx.scene.chart.XYChart;

import java.util.function.Function;

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
            seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY2(x, paramA)));
        }
        graph.getData().add(seriesNegative);
    }


    private double calculate3(double x, double const1, double const2, double const3) {
        return 0;
    }
    /**???*/
    public void plotLine3(final double paramA, final double paramB, final double paramC){

        XYChart.Series<Double, Double> series = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            series.getData().add(new XYChart.Data<>(x, calculate3(x, paramA, paramB, paramC)));
        }
        graph.getData().add(series);


        XYChart.Series<Double, Double> seriesNegative = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
           // seriesNegative.getData().add(new XYChart.Data<>(x, -calculateY3(x, paramA, paramB)));
        }
        graph.getData().add(seriesNegative);
    }


    private double calculateX(double x, double const1) {

            return const1 * Math.sqrt(Math.toRadians(const1));
    }

    private double calculateY(double x, double const1) {
        return 0;
    }
    /**Ferma's spiral???*/
    public void plotLine4(final double paramA){

        XYChart.Series<Double, Double> seriesX = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            for(int i = 0; i <360; i+=10) {
                seriesX.getData().add(new XYChart.Data<>(x, calculateX(x, paramA)));
            }
        }
        graph.getData().add(seriesX);


        XYChart.Series<Double, Double> seriesY = new XYChart.Series<>();
        for(double x = -range; x <= range; x = x + 0.01) {
            // seriesY.getData().add(new XYChart.Data<>(x, -calculateY(x, paramA)));
        }
        graph.getData().add(seriesY);
    }


    private double calculate5X(double const1, double const2, double t, double j) {
        return Math.cos(const1*t)-Math.pow(Math.cos(const2*t),j);
    }
    private double calculate5Y(double const1, double const2, double t, double k) {
        return Math.sin(const1*t)-Math.pow(Math.sin(const2*t),k);
    }
    /**Graph x = cos(a*t) - cos(b*t)^j & y = sin(c*t) - sin(d*t)^k ????????*/
    public void plotLine5(final double paramA, final double paramB, final double paramC, final double paramD, final double paramJ, final double paramK){
        XYChart.Series<Double, Double> seriesY = new XYChart.Series<>();
        for(double T = -range; T <= range; T = T+0.01) {
            seriesY.getData().add(new XYChart.Data<>(calculate5X(paramA, paramB, T, paramJ), calculate5Y(paramC, paramD, T, paramK)));
        }
        graph.getData().add(seriesY);


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