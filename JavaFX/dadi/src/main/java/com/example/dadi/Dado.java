package com.example.dadi;

import java.util.Random;

public class Dado {
    private int facce;
    private int lancio;

    public Dado(int f){
        this.facce = f;
    }

    public void lancia(int f){
        Random n = new Random();
        this.lancio = n.nextInt(f) + 1;
    }

    public int getLancio(){
        return this.lancio;
    }

    @Override
    public String toString(){
        return "" + this.lancio;
    }
}
