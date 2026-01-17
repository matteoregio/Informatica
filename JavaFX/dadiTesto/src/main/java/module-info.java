module com.example.daditesto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.daditesto to javafx.fxml;
    exports com.example.daditesto;
}