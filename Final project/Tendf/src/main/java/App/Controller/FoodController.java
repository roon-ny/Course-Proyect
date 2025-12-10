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

public class FoodController {

    private DailyRecord record;

    @FXML
    private Label lblFood;
    @FXML
    private Button btnsaveee;

    private Map<String, Integer> foodScores = new HashMap<>();

    public void setRecord(DailyRecord record) {
        this.record = record;
    }

    @FXML
    public void initialize() {
        foodScores.put("I had breakfast", 3);
        foodScores.put("Snacks", 1);
        foodScores.put("I had lunch", 4);
        foodScores.put("Drink water", 2);
        foodScores.put("I had dinner", 4);
        foodScores.put("I didn't eat today", -5);
    }

    @FXML
    private void onFoodClick(ActionEvent event) {
        if (record == null) return;

        Button btn = (Button) event.getSource();
        String foodChoice = btn.getText();
        lblFood.setText(foodChoice);

        int score = foodScores.getOrDefault(foodChoice, 0);

        record.setFood(foodChoice);
        record.setFoodScore(score);

        System.out.println("Food: " + foodChoice + " | score: " + score);
    }

    private void guardarJson() {
        if (record == null) return;
        try (FileWriter writer = new FileWriter("dailyRecord.json")) {
            new GsonBuilder().setPrettyPrinting().create().toJson(record, writer);
            System.out.println("JSON guardado correctamente con food!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void guardar() throws IOException {
        if (record == null) return;

        record.actualizarTotal();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Score.fxml"));
        Parent root = loader.load();

        ScoreController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) btnsaveee.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

        guardarJson();
    }

    @FXML
    private void salirr() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/DayView.fxml"));
        Parent root = loader.load();

        DayViewController controller = loader.getController();
        controller.setRecord(record);

        Stage stage = (Stage) btnsaveee.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}


