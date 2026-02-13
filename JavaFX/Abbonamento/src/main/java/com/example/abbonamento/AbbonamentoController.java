package com.example.abbonamento;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.time.LocalDate;

public class AbbonamentoController {
    @FXML
    private Label txtdurata;

    @FXML
    private RadioButton rdmensile;
    @FXML
    private RadioButton rdsemestrale;
    @FXML
    private RadioButton rdannuale;

    @FXML
    private DatePicker data;

    @FXML
    protected void onCalcolaButtonClick() {
        LocalDate n = null;
        LocalDate d = data.getValue();
        if(rdmensile.isSelected()){
            n = d.plusMonths(1);
        }else if(rdsemestrale.isSelected()){
            n = d.plusMonths(6);
        }else if(rdannuale.isSelected()){
            n = d.plusYears(1);
        }

        txtdurata.setText("Il tuo abbonamento è valido fino al " + n.toString());

    }
}