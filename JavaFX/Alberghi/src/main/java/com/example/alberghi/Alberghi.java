package com.example.alberghi;

import java.time.LocalDate;

public class Alberghi {
    private LocalDate d1;
    private LocalDate d2;

    public Alberghi(LocalDate d1, LocalDate d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    public int calcolaPrezzo(int ppn, int gg){
        return ppn * gg;
    }

    public int calcolagg(){
        int conta = 1;
        if(this.d1.isAfter(this.d2)){
            LocalDate d = this.d2;
            while(this.d1.isAfter(d)){
                d = d.plusDays(1);
                conta++;
            }
        }else{
            LocalDate m = this.d1;
            while(this.d2.isAfter(m)){
                m = m.plusDays(1);
                conta++;
            }
        }
        return conta;
    }
}
