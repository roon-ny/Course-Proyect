module com.example.tendf {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires com.google.gson;
    requires java.desktop;

    opens App.Controller to javafx.fxml;
    opens App to javafx.fxml;

    opens App.Model to com.google.gson;

    exports App;
}