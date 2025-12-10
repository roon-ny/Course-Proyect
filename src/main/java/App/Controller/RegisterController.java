package App.Controller;

import App.Model.User;
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

public class RegisterController {

    @FXML
    private TextField txtUser;

    @FXML
    private PasswordField txtPass;

    @FXML
    private PasswordField txtConfirm;

    @FXML
    private Button btnback;

    @FXML
    private Button btnaccount;

    @FXML
    private Label lblMensaje;

    @FXML
    void registrarUser(javafx.event.ActionEvent event) throws IOException {

        String usuario = txtUser.getText().trim();
        String pass = txtPass.getText().trim();
        String pass2 = txtConfirm.getText().trim();

        if (usuario.isEmpty() || pass.isEmpty() || pass2.isEmpty()) {
            lblMensaje.setText("Fill all the boxes");
            return;
        }

        if (!pass.equals(pass2)) {
            lblMensaje.setText("The passwords do not match");
            return;
        }

        UserDataBase db = new UserDataBase();

        if (db.userExists(usuario)) {
            lblMensaje.setText("This user already exists ❌");
            return;
        }

        User newUser = new User(usuario, pass);
        UserDataBase.addUser(newUser);

        lblMensaje.setText("Successful registration ✔️");

        irAlogin();

    }

    private void irAlogin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
        Stage stage = (Stage) txtUser.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
}

    @FXML
    private void goback() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
        Stage stage = (Stage) btnback.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}