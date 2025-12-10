package App.Controller;

import App.Model.DailyRecord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class DayViewController {

    @FXML private Label lblDay;
    @FXML private Button btnemo;
    @FXML private Button btnsle;
    @FXML private Button btnfoo;
    @FXML private Button bday;
    @FXML private TextArea notesArea;



    private DailyRecord record = new DailyRecord();

    public void setRecord(DailyRecord record) {
        this.record = record;

        notesArea.setText(record.getJournaly());

    }

    public DailyRecord getRecord() {
        return record;
    }
    @FXML
    private void savenotes(ActionEvent event) {
        if (record != null) {
            record.setJournaly(notesArea.getText());
            System.out.println("Notas guardadas: " + record.getJournaly());
        }
    }
    @FXML
    public void initialize() {
        lblDay.setText("Day: " + UserDataBase.diaSeleccionado);
    }

    @FXML
    private void openAemotion() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Emotion.fxml"));
        Parent root = loader.load();

        EmotionController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) btnemo.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void openSleep() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sleep.fxml"));
        Parent root = loader.load();

        SleepController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) btnsle.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void openFood() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Food.fxml"));
        Parent root = loader.load();

        FoodController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) btnfoo.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void backcalendarr() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Calendar.fxml"));
        Stage stage = (Stage) bday.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

