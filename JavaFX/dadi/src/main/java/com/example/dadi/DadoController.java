package com.example.dadi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DadoController {

    private Dado d;

    @FXML
    public void initialize(){
        d = new Dado(6);
    }

    @FXML
    private Label lbllancio;

    public void onSeiButtonClick(){
        if(onLanciaButtonClick() == -1) {
            d.lancia(6);
            lbllancio.setText(d.toString());
        }
    }

    public void onDieciButtonClick(){
        if(onLanciaButtonClick() == -1) {
            d.lancia(10);
            lbllancio.setText(d.toString());
        }
    }

    public void onVentiButtonClick(){
        if(onLanciaButtonClick() == -1) {
            d.lancia(20);
            lbllancio.setText(d.toString());
        }
    }

    @FXML
    protected int onLanciaButtonClick() {
        return -1;
    }
}