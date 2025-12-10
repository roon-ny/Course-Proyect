package App.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;
import java.io.IOException;

public class CalendarController {

    @FXML
    private MenuButton btnMonth;


    @FXML
    private Label lblHello;

    private String username;

    @FXML
    private void openDay(javafx.event.ActionEvent event) throws IOException {

        Button btn = (Button) event.getSource();
        String dia = btn.getText();

        UserDataBase.diaSeleccionado = dia;

        Parent root = FXMLLoader.load(getClass().getResource("/DayView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Día " + dia);
        stage.show();
    }

    public void initialize() {
    }

    public void setUsername(String username) {
        this.username = username;
        lblHello.setText("Hello " + username);
    }



    @FXML
    private void LogOut() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Calendar");
        stage.setScene(new Scene(root));
        stage.show();
    }


}
