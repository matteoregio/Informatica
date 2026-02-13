package com.example.abbonamento;

public class Abbonamento {
    private int mensile;
    private int annuale;
    private int semestrale;

    public Abbonamento(){
        this.mensile = 1;
        this.annuale = 12;
        this.semestrale = 6;
    }

    public int getMesiAbbonamento(int n){
        return 12*n;
    }
}
