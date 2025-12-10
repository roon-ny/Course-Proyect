package App.Controller;

import App.Model.DailyRecord;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SleepController {

    private DailyRecord record;

    @FXML
    private Label lblSleep;

    private Map<String, Integer> sleepScores = new HashMap<>();

    public void setRecord(DailyRecord record) {
        this.record = record;
    }

    @FXML
    public void initialize() {
        sleepScores.put("Less than an hour", -4);
        sleepScores.put("1-3 hours", -3);
        sleepScores.put("4-7 hours", 1);
        sleepScores.put("8 hours", 3);
        sleepScores.put("More than eight hours", 2);
    }

    private void guardarJson() {
        if (record == null) return;
        try (FileWriter writer = new FileWriter("dailyRecord.json")) {
            new GsonBuilder().setPrettyPrinting().create().toJson(record, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onSleepClick(ActionEvent event) {
        if (record == null) return;

        Button btn = (Button) event.getSource();
        String hours = btn.getText();
        lblSleep.setText(hours);

        int score = sleepScores.getOrDefault(hours, 0);

        record.setSleepHours(hours);
        record.setSleepScore(score);
    }

    @FXML
    private void irAfood(ActionEvent event) throws IOException {
        guardarJson();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Food.fxml"));
        Parent root = loader.load();

        FoodController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) lblSleep.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void salirrr() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/DayView.fxml"));
        Parent root = loader.load();

        DayViewController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) lblSleep.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
