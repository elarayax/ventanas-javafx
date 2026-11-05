module com.example.vistas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vistas.views to javafx.fxml;
    opens com.example.vistas.controller to javafx.fxml;
    exports com.example.vistas;
}