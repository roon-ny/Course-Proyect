package App.Controller;

import App.Model.DailyRecord;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;

public class ScoreController {

    private DailyRecord record;

    public void setRecord(DailyRecord record) {
        this.record = record;
    }

    @FXML
    private TextArea textArea;
    @FXML
    private Label labelDia;
    @FXML
    private Button scoreButton;

    @FXML
    private void initialize() {
    }

    @FXML
    private void scoreButton() {
        if (record == null) {
            textArea.setText("No data available.");
            return;
        }

        int score = record.getTotalScore();
        textArea.setText("Total Score: " + score);

        Color color;
        String rango;

        if (score <= 3) {
            rango = "Bad";
            color = Color.RED;
        } else if (score <= 6) {
            rango = "Regular";
            color = Color.ORANGE;
        } else if (score <= 9) {
            rango = "Good";
            color = Color.YELLOW;
        } else {
            rango = "Excellent";
            color = Color.DARKGREEN;
        }

        labelDia.setText(rango);
        labelDia.setTextFill(color);

        if (scoreButton != null) {
            scoreButton.setStyle("-fx-background-color: " + toRgbString(color) + "; -fx-text-fill: white;");
        }
        if (textArea != null) {
            textArea.setStyle("-fx-control-inner-background: " + toRgbString(color) + "; -fx-text-fill: white;");
        }
    }

    @FXML
    private void saveall() {
        textArea.setText("Save functionality not implemented yet.");
    }

    @FXML
    private void backinicio() {
    }

    private String toRgbString(Color c) {
        return "rgb(" + (int)(c.getRed()*255) + "," + (int)(c.getGreen()*255) + "," + (int)(c.getBlue()*255) + ")";
    }
}
