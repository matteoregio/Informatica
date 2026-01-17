package com.example.pag_128__es_7;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lblOperazione;

    @FXML
    private Label lblErrore;

    @FXML
    private TextField txtn1;

    @FXML
    private TextField txtn2;

    @FXML
    protected void onPiuButtonClick() {
        try {
            lblErrore.setText("");
            int n = Integer.parseInt(txtn1.getText());
            int v = Integer.parseInt(txtn2.getText());
            int somma = n + v;
            lblOperazione.setText("" + somma);
        }catch(Exception e) {
            lblErrore.setText("Errore!! Devi inserire solo dei numeri");
        }
    }

    @FXML
    protected void onMenoButtonClick() {
        try{
            lblErrore.setText("");
            int n = Integer.parseInt(txtn1.getText());
            int v = Integer.parseInt(txtn2.getText());
            int sottrazione = n - v;
            lblOperazione.setText("" + sottrazione);
        }catch(Exception e){
            lblErrore.setText("Errore!! Devi inserire solo dei numeri");
        }

    }

    @FXML
    protected void onPerButtonClick() {
        try {
            lblErrore.setText("");
            int n = Integer.parseInt(txtn1.getText());
            int v = Integer.parseInt(txtn2.getText());
            int moltiplicazione = n * v;
            lblOperazione.setText("" + moltiplicazione);
        }catch(Exception e){
            lblErrore.setText("Errore!! Devi inserire solo dei numeri");
        }
    }

    @FXML
    protected void onDivisoButtonClick() {
        try {
            lblErrore.setText("");
            int n = Integer.parseInt(txtn1.getText());
            int v = Integer.parseInt(txtn2.getText());
            float divisione = (float) n / (float) v;
            lblOperazione.setText("" + divisione);
        }catch(Exception e){
            lblErrore.setText("Errore!! Devi inserire solo dei numeri");
        }
    }
}