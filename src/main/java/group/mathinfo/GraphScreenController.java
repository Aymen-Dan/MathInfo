package group.mathinfo;

import graph.maths.MyGraph;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.ScatterChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GraphScreenController implements Initializable {



    @FXML
    private LineChart<Number, Number> lineGraph;

    @FXML
    private ScatterChart<Double, Double> scatterGraph;

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

    private MyGraph lineMathsGraph;


    @FXML
    private Label label1;
    @FXML
    private TextField textField1;

    @FXML
    private Label label2;
    @FXML
    private TextField textField2;

    @FXML
    private Label label3;
    @FXML
    private TextField textField3;

    @FXML
    private Label label4;
    @FXML
    private TextField textField4;

    @FXML
    private Label label5;
    @FXML
    private TextField textField5;

    @FXML
    private Label label6;
    @FXML
    private TextField textField6;

    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
       lineMathsGraph = new MyGraph(lineGraph, 10);


    }


    @FXML
    private void handleGraph1ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        lineMathsGraph.plotLine1(a);
    }

    @FXML
    private void handleGraph2ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        lineMathsGraph.plotLine2(a);

    }
    @FXML
    private void handleGraph3ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        lineMathsGraph.plotLine3(a);

    }
    @FXML
    private void handleGraph4ButtonAction(final ActionEvent event) {


    }
    @FXML
    private void handleGraph5ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        double b = Double.parseDouble(textField2.getText());
        double c = Double.parseDouble(textField3.getText());
        double d = Double.parseDouble(textField4.getText());
        double j = Double.parseDouble(textField5.getText());
        double k = Double.parseDouble(textField6.getText());

        lineMathsGraph.plotLine5(a,b,c,d,j,k);

    }


    @FXML
    private void handleGraph1InfoButtonAction(final ActionEvent event) {
        final Stage infoWindow = new Stage();
        infoWindow.setResizable(false);
        infoWindow.initModality(Modality.NONE);
        infoWindow.initOwner(((Node) event.getSource()).getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            infoWindow.setScene(new Scene(fxmlLoader.load(getClass().getResource("infoWindow.fxml").openStream())));

        } catch (IOException e) {
            e.printStackTrace();
        }
        infoWindow.show();
        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Цисоїда Діокла", "Опис функції");
    }
    @FXML
    private void handleGraph2InfoButtonAction(final ActionEvent event) {
        final Stage infoWindow = new Stage();
        infoWindow.setResizable(false);
        infoWindow.initModality(Modality.NONE);
        infoWindow.initOwner(((Node) event.getSource()).getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            infoWindow.setScene(new Scene(fxmlLoader.load(getClass().getResource("infoWindow.fxml").openStream())));

        } catch (IOException e) {
            e.printStackTrace();
        }

        infoWindow.show();

        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Лемніската Бернуллі", "Назва походить з античного Риму, де «лемніскатою» називали бантик,\n з допомогою якого прикріпляли вінок до голови переможця на\nспортивних іграх. Цю лемніскату називають в честь швейцарського\nматематика Якоба Бернуллі, який поклав початок її вивченню.\nУ техніці лемніската використовується як перехідна крива під час\nзаокруглення малого" +
                "радіуса. Наприклад, на залізничних лініях\nв гірській місцевості і на трамвайних шляхах.\n" +
                "В галузі фізики лемніскатою в окремому випадку є еквіпотенціальні\nлінії поля, які" +
                "створюються двома паралельними струмами\nпо нескінченно довгих провідниках, у перпендикулярній до них\nплощині.");
    }
    @FXML
    private void handleGraph3InfoButtonAction(final ActionEvent event) {
        final Stage infoWindow = new Stage();
        infoWindow.setResizable(false);
        infoWindow.initModality(Modality.NONE);
        infoWindow.initOwner(((Node) event.getSource()).getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            infoWindow.setScene(new Scene(fxmlLoader.load(getClass().getResource("infoWindow.fxml").openStream())));

        } catch (IOException e) {
            e.printStackTrace();
        }

        infoWindow.show();

        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Спіраль Ферма", "Спіралі постійно зустрічаються у нашому житті. Наприклад, у квітці\nсоняшника група спіралей залягає числами Фібоначчі, оскільки\nдивергенція (кут послідовності в спіралей) прямує до золотого\nвідношення. Форма спіралей залежить від росту послідовних елементів.\nВ зрілій квітці (коли всі елементи мають однаковий розмір) спіралі\nнасіння є спіралями Ферма. Це тому що спіралі Ферма перетинають\nрівня кільця в однакових положеннях.\nТакож із цікавих фактів про спіралі:\nБернуллі (його Лемніската представлена другим графіком) вбачав\nу логарифмічній спіралі символ безкінечного циклу життів,\nі тому побажав, щоб її зобразили на його надгробку. Проте мулярі\nпомилилися, і замість цього зобразили спіраль Архімеда.");
    }

    @FXML
    private void handleGraph4InfoButtonAction(final ActionEvent event) {
        final Stage infoWindow = new Stage();

        infoWindow.setResizable(false);
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
    private void handleGraph5InfoButtonAction(final ActionEvent event) {
        final Stage infoWindow = new Stage();
        infoWindow.setResizable(false);
        infoWindow.initModality(Modality.NONE);
        infoWindow.initOwner(((Node) event.getSource()).getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            infoWindow.setScene(new Scene(fxmlLoader.load(getClass().getResource("infoWindow.fxml").openStream())));

        } catch (IOException e) {
            e.printStackTrace();
        }

        infoWindow.show();

        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Графік 5", "Опис функції");
    }



    @FXML
    private void handleClearButtonAction(final ActionEvent event) {
        clear();
    }

    @FXML
    private void handleReturnButtonAction(final ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        try {
            stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("buttonChoice.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        lineMathsGraph.clear();

    }
}

