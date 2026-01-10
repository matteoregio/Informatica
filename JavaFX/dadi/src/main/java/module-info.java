module com.example.dadi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dadi to javafx.fxml;
    exports com.example.dadi;
}