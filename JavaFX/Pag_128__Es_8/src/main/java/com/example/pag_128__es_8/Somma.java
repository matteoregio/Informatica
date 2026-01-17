package com.example.pag_128__es_8;

public class Somma {
    private int n1;
    private int n2;
    private int s;

    public Somma(){
    }

    public int getSomma(int n1, int n2){
        this.s = n1 + n2;
        return n1 + n2;
    }

    @Override
    public String toString(){
        return "" + s;
    }
}
