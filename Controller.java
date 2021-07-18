package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bottoP;

    @FXML
    private TextField botto = new TextField();

    @FXML
    public Label label = new Label();

    @FXML
    void initialize() {
        bottoP.setOnMouseClicked(mouseEvent -> {
            double dist;
            int a = Integer.parseInt(botto.getText());

            dist = 335 * a;//335 м\с скорость распространения звука в воздхухе
            label.setText(" Расстояние до обьекта " + dist / 2);
        });
    }
}