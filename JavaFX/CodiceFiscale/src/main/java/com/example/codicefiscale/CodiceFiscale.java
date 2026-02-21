package com.example.codicefiscale;

import java.time.LocalDate;
import java.util.ArrayList;

public class CodiceFiscale {
    private String cognome;
    private String nome;
    private LocalDate data;
    private String sesso;
    private String luogo;
    private String controllo;

    public CodiceFiscale(){

    }

    public String getCognome(){
        String consonanti = "";

        if (this.cognome.length() < 3) {
            return this.cognome.toUpperCase() + 'X';
        }

        for (int i = 0; i < this.cognome.length(); i++) {
            if(cognome.charAt(i) != 'a' && cognome.charAt(i) != 'e' && cognome.charAt(i) != 'i' && cognome.charAt(i) != 'o' && cognome.charAt(i) != 'u'){
                consonanti += this.cognome.charAt(i);
            }
        }
        if(consonanti.length() < 3){
            for (int i = 0; i < this.cognome.length(); i++) {
                if(cognome.charAt(i) == 'a' && cognome.charAt(i) == 'e' && cognome.charAt(i) == 'i' && cognome.charAt(i) == 'o' && cognome.charAt(i) == 'u'){
                    while(consonanti.length() == 3){
                        consonanti += this.cognome.charAt(i);
                    }
                }
            }
        }

        consonanti.toUpperCase();
        return consonanti;
    }

    public String getNome(){
        String consonanti = "";
        int contaConsonanti = 0;
        ArrayList <String> c = new ArrayList<>();

        if (this.nome.length() < 3) {
            return this.nome.toUpperCase() + 'X';
        }

        for (int i = 0; i < this.nome.length(); i++) {
            if(nome.charAt(i) != 'a' && nome.charAt(i) != 'e' && nome.charAt(i) != 'i' && nome.charAt(i) != 'o' && nome.charAt(i) != 'u'){
                contaConsonanti++;
                c.add(String.valueOf(this.nome.charAt(i)));
            }
        }

        if(contaConsonanti == 3){
            for (int i = 0; i < this.nome.length(); i++) {
                if(nome.charAt(i) != 'a' && nome.charAt(i) != 'e' && nome.charAt(i) != 'i' && nome.charAt(i) != 'o' && nome.charAt(i) != 'u'){
                    consonanti += this.nome.charAt(i);
                }
            }
        }else if(contaConsonanti < 3){

            for (int i = 0; i < this.nome.length(); i++) {
                if(nome.charAt(i) != 'a' && nome.charAt(i) != 'e' && nome.charAt(i) != 'i' && nome.charAt(i) != 'o' && nome.charAt(i) != 'u'){
                    consonanti += this.nome.charAt(i);
                }
            }

            for (int i = 0; i < this.nome.length(); i++) {
                if(nome.charAt(i) == 'a' && nome.charAt(i) == 'e' && nome.charAt(i) == 'i' && nome.charAt(i) == 'o' && nome.charAt(i) == 'u'){
                    while(consonanti.length() == 3){
                        consonanti += this.nome.charAt(i);
                    }
                }
            }
        }else{
            consonanti = c.get(0) + c.get(2) + c.get(3);
        }

        return consonanti.toUpperCase();
    }

    public String getAnno(){
        String anno = String.valueOf(this.data.getYear());

    }
}
