package com.example.alberghi;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class AlberghiController {
    @FXML
    private Label lblprezzo;

    @FXML
    private Label lblerrore;

    @FXML
    private DatePicker d1;

    @FXML
    private DatePicker d2;

    @FXML
    private TextField txtPrezzo;

    @FXML
    protected void onCalcolaButtonClick() {
        try {
            lblerrore.setText("");
            LocalDate date1 = d1.getValue();
            LocalDate date2 = d2.getValue();
            int n = Integer.parseInt(txtPrezzo.getText());
            Alberghi hotel = new Alberghi(date1, date2);
            int gg = hotel.calcolagg();
            int prezzoFinale = hotel.calcolaPrezzo(n, gg);
            lblprezzo.setText(prezzoFinale + "");
        } catch (Exception e) {
            lblerrore.setText("Attenzione!! Si possono inserire solo dei numeri");
        }
    }
}