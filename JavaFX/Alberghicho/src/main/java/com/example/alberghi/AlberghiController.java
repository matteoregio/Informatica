package com.example.alberghi;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.util.ArrayList;

public class AlberghiController {
    @FXML
    private Label lblprezzo;

    @FXML
    private DatePicker d1;

    @FXML
    private DatePicker d2;

    @FXML
    private ChoiceBox choTipoPrezzo;

    @FXML
    protected void initialize(){
        ArrayList <String> v = new ArrayList<>();
        v.add("Alto | 100€");
        v.add("Medio  | 50€");
        v.add("Basso | 30€");
        choTipoPrezzo.getItems().addAll(v);
        choTipoPrezzo.getSelectionModel().selectFirst();

        LocalDate n = LocalDate.now();
        LocalDate n1 = n.plusDays(1);
        d1.setValue(n);
        d2.setValue(n1);
    }

    @FXML
    protected void onCalcolaButtonClick() {
        LocalDate date1 = d1.getValue();
        LocalDate date2 = d2.getValue();
        int tipo = choTipoPrezzo.getSelectionModel().getSelectedIndex();
        Alberghi hotel = new Alberghi(date1, date2);
        int gg = hotel.calcolagg();
        int prezzoFinale = hotel.calcolaPrezzo(tipo, gg);
        lblprezzo.setText(prezzoFinale + "");
    }
}