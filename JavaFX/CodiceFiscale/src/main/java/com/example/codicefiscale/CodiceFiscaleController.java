package com.example.codicefiscale;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CodiceFiscaleController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}