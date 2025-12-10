package App.Controller;

import App.Model.DailyRecord;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EmotionController {

    private DailyRecord record;

    private Map<String, Integer> emotionScores = new HashMap<>();

    @FXML
    private Label lblemotion;
    @FXML
    private Button btnSave;

    public void setRecord(DailyRecord record) {
        this.record = record;
    }

    @FXML
    public void initialize() {
        emotionScores.put("Happy", 5);
        emotionScores.put("Sad", -2);
        emotionScores.put("Angry", -3);
        emotionScores.put("Stressed", -4);
        emotionScores.put("Proud", 5);
        emotionScores.put("Calm", 3);
        emotionScores.put("Tired", -1);
        emotionScores.put("Worried", -2);
        emotionScores.put("Confident", 4);
        emotionScores.put("Hopeful", 3);
        emotionScores.put("Grateful", 4);
        emotionScores.put("Relaxed", 3);
    }

    private void guardarJson() {
        if (record == null) return;

        try (FileWriter writer = new FileWriter("dailyRecord.json")) {
            new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(record, writer);
            System.out.println("JSON guardado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onEmotionClick(ActionEvent event) {
        if (record == null) return;

        Button btn = (Button) event.getSource();
        String emotion = btn.getText();
        lblemotion.setText(emotion);

        record.setEmotion(emotion);
        record.setEmotionScore(emotionScores.getOrDefault(emotion, 0));
    }

    @FXML
    private void irASueno() throws IOException {
        guardarJson();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sleep.fxml"));
        Parent root = loader.load();

        SleepController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) lblemotion.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void salir() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/DayView.fxml"));
        Parent root = loader.load();

        DayViewController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) lblemotion.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}





