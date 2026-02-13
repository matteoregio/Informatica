module com.example.carte {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.carte to javafx.fxml;
    exports com.example.carte;
}