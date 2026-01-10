package com.example.contatore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ContatoreController {

    private ContatoreModel contatore;


    @FXML
    public void initialize(){
        contatore = new ContatoreModel();
    }

    @FXML
    private Label lblContatore;

    @FXML
    protected void onIncrementaButtonClick() {
        contatore.next();
        lblContatore.setText(contatore.toString());
    }

    public void onIncrementaDueButtonClick() {
        contatore.next();
        contatore.next();
        lblContatore.setText(contatore.toString());
    }
}