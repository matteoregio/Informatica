package com.example.pag_128__es_8;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label somma;

    @FXML
    private Label lblErrore;

    private Somma s;

    @FXML
    public void initialize(){
        s = new Somma();
    }

    @FXML
    private TextField txtn1;

    @FXML
    private TextField txtn2;

    @FXML
    protected void onSommaButtonClick() {
        int n = 0;
        int v = 0;
        try {
            lblErrore.setText("");
            n = Integer.parseInt(txtn1.getText());
            v = Integer.parseInt(txtn2.getText());
        } catch (Exception e) {
            lblErrore.setText("Errore!!!");
        }
        s.getSomma(n, v);
        somma.setText("" + s);
    }
}