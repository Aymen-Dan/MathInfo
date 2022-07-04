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
        double a = Double.parseDouble(textField1.getText());
        double b = Double.parseDouble(textField2.getText());
        lineMathsGraph.plotLine4(a,b);

    }
    @FXML
    private void handleGraph5ButtonAction(final ActionEvent event) {
        double a = Double.parseDouble(textField1.getText());
        double c = Double.parseDouble(textField2.getText());

        lineMathsGraph.plotLine5(a,c);

    }

    @FXML
    private void handleGraph6ButtonAction(final ActionEvent event) {
        double b = Double.parseDouble(textField1.getText());
        double d = Double.parseDouble(textField2.getText());

        lineMathsGraph.plotLine6(b,d);

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
        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Цисоїда Діокла", "Вперше цисоїду досліджував грецький математик Діокл у II столітті\nдо н.е. Він будував її за допомогою кола, і графік обмежувався ним.\nЯкщо цю частину цисоїди обмежити правою дугою кола, то виходить\nфігура, що нагадує своєю формою листок плюща. Грецькою\nплющ - χισσος («хіссос»), від чого й походить назва кривої - «цисоїда».\nВ сучасному вигляді цисоїду відтворив французький математик Жиль\nРоберваль у 1640 році. Пізніше її також досліджував голландський\nматематик Слюз.");
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

        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Функція", "Найперші офіційні дослідження лімасонів зазвичай приписують\nЕтьєну Паскалю, батькові Блеза Паскаля. Однак німецький художник\nепохи Відродження Альбрехт Дюрер ще до цього проводив цікаві\nдослідження на цю тему. \"Underweysung der Messung\" (Інструкція з\nвимірювання) Дюрера містить спеціальні геометричні методи\nстворення лімасонів. Ім'я кривій дав Жиль де Роберваль, коли він\nвикористав її як приклад для знаходження дотичних ліній.\nКардіоїда — це окремий випадок лімасону, коли точка, що створює\nрулетку, лежить на колі кочення; отримана крива має вершину.\nЗалежно від положення точки, що створює криву, вона можемати\nвнутрішню та зовнішню петлі (що дає назву родині), а також може мати\nформу серця або овальну форму.");
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

        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Графік 5", "Це дуже цікаве складне параметричне рівняння.\nВ залежності від коефіцієнтів, графічне зображення може кардинально\nзмінювати форму. При цьому варто змінювати коефіцієнти за\nвизначеною закономірністю. А саме: додати коефіцієнт у дужки першого\nкосинуса х та першого синуса у, а коефіцієнти у других залишити\nрівними 1, або ж навпаки.\nЦя графічна реалізація демонструє вигляд графіка у випадку, коли \nзмінювані лише перші коефіцієнти х та у.\nДруга реалізація наявна у графіку 6.");
    }

    @FXML
    private void handleGraph6InfoButtonAction(final ActionEvent event) {
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

        ((InfoWindowContoller)fxmlLoader.getController()).setContents("Графік 6", "Це дуже цікаве складне параметричне рівняння.\nВ залежності від коефіцієнтів, графічне зображення може кардинально\nзмінювати форму. При цьому варто змінювати коефіцієнти за\nвизначеною закономірністю. А саме: додати коефіцієнт у дужки першого\nкосинуса х та першого синуса у, а коефіцієнти у других залишити\nрівними 1, або ж навпаки.\nЦя графічна реалізація демонструє вигляд графіка у випадку, коли \nзмінювані лише другі коефіцієнти х та у.\nДруга реалізація наявна у графіку 5.");
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

