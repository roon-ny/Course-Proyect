package App;

import App.Controller.UserDataBase;
import App.Model.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        UserDataBase.loadUsers();
        Database.loadRecords();

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tend");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
