module com.example.alberghi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alberghi to javafx.fxml;
    exports com.example.alberghi;
}