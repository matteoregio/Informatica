package com.example.contatore;

public class ContatoreModel {
    private int conta = 0;

    public void next(){
        this.conta++;
    }

    @Override
    public String toString(){
        return "" + this.conta;
    }
}
