package com.example.codicefiscale;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.Date;

public class CodiceFiscaleController {

    @FXML
    private TextField nome;
    @FXML
    private TextField cognome;
    @FXML
    private TextField luogo;
    @FXML
    private DatePicker data;
    @FXML
    private ChoiceBox sesso;
    @FXML
    private Label cod;

    @FXML
    private void initialize(){
        String m = "M";
        String f = "F";
        sesso.getItems().add(m);
        sesso.getItems().add(f);
    }

    @FXML
    protected void onCalcolaButtonClick() {
        String n = nome.getText();
        String c = cognome.getText();
        String l = luogo.getText();
        LocalDate d = data.getValue();
        String s = String.valueOf(sesso.getSelectionModel().getSelectedItem());

        CodiceFiscale cf = new CodiceFiscale(c, n, d, s, l);
        String codfis = cf.getCodiceFiscale();

        cod.setText(codfis);
    }
}