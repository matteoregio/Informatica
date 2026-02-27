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

    public CodiceFiscale(String c, String n, LocalDate d, String s, String l){
        this.cognome = c;
        this.nome = n;
        this.data = d;
        this.sesso = s;
        this.luogo = l;
    }

    public String getCognome() {
        String consonanti = "";

        for (int i = 0; i < this.cognome.length(); i++) {
            char c = this.cognome.toLowerCase().charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c >= 'a' && c <= 'z') {
                consonanti += this.cognome.charAt(i);
            }
        }

        if (consonanti.length() < 3) {
            for (int i = 0; i < this.cognome.length(); i++) {
                char c = this.cognome.toLowerCase().charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    consonanti += this.cognome.charAt(i);
                    if (consonanti.length() == 3) break;
                }
            }
        }

        while (consonanti.length() < 3) {
            consonanti += 'X';
        }

        return consonanti.toUpperCase().substring(0, 3);
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

        if(consonanti.length() < 3){
            consonanti += "X";
        }

        return consonanti.toUpperCase();
    }

    public String getAnno(){
        String anno = String.valueOf(this.data.getYear());
        String a = "";
        for (int i = 0; i < anno.length(); i++) {
            if(i > 1){
                a += anno.charAt(i);
            }
        }

        return a;
    }

    public String getMese(){
        int mese = this.data.getMonthValue();
        String m = "";
        if(mese == 1){
            m += "A";
        }else if(mese == 2){
            m += "B";
        }else if(mese == 3){
            m += "C";
        }else if(mese == 4){
            m += "D";
        }else if(mese == 5){
            m += "E";
        }else if(mese == 6){
            m += "H";
        }else if(mese == 7){
            m += "L";
        }else if(mese == 8){
            m += "M";
        }else if(mese == 9){
            m += "P";
        }else if(mese == 10){
            m += "R";
        }else if(mese == 11){
            m += "S";
        }else{
            m += "T";
        }

        return m;
    }

    public String getSessoGiorno(){
        String sg = String.valueOf(this.data.getDayOfMonth());
        if(this.sesso.equals("M")){
            if(sg.length() == 1){
                String s = "0" + sg;

                return s;
            }
            return sg;
        }else{
            int g = Integer.parseInt(sg);
            g += 40;

            return String.valueOf(g);
        }
    }

    public String getLuogo (){
       return "B157";
    }

    public String getControllo(){
        return "X";
    }

    public String getCodiceFiscale(){
        return getCognome() + getNome() + getAnno() + getMese() + getSessoGiorno() + getLuogo() + getControllo();
    }
}
