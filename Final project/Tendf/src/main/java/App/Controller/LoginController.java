package App.Controller;

import App.Controller.UserDataBase;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblMensajeLogin;

    @FXML
    private Button btnbackd;

    @FXML
    private void openCalendar() throws IOException {

        String usuario = txtName.getText().trim();
        String pass = txtPassword.getText().trim();

        if (usuario.isEmpty() || pass.isEmpty()) {
            lblMensajeLogin.setText("Completa todos los campos");
            return;
        }

        UserDataBase db = new UserDataBase();

        if (db.findUser(usuario, pass)) {

            lblMensajeLogin.setText("Inicio de sesión exitoso ✔️");

            irACalendar(usuario);

        } else {
            lblMensajeLogin.setText("Usuario o contraseña incorrectos ❌");
        }
    }

    private void irACalendar(String usuario) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Calendar.fxml"));
        Parent root = loader.load();

        CalendarController controller = loader.getController();
        controller.setUsername(usuario);   // Aquí enviamos el usuario

        Stage stage = (Stage) txtName.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Calendar");
        stage.show();
    }

    @FXML
    private void goback() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
        Stage stage = (Stage) txtName.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
