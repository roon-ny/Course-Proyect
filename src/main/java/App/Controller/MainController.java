package App.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {

    @FXML
    private Button btnentrar;

    @FXML
    private Button btncrear;

    @FXML
    private void openLogin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Iniciar Sesión");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void openRegisters() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Register.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Registrarse");
        stage.setScene(new Scene(root));
        stage.show();
    }
}

