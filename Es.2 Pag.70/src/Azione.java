import java.time.LocalDate;
import java.time.LocalTime;

public class Azione {
    private String de;
    private LocalDate d;
    private LocalTime t;
    private int att;

    public Azione(String de, int att){
        this.de = de;
        this.att = att;
        this.d = LocalDate.now();
        this.t = LocalTime.now();
    }

    public String getDe() {
        return this.de;
    }

    public LocalDate getD(){
        return this.d;
    }

    public LocalTime getT(){
        return this.t;
    }

    public int getAtt(){
        return this.att;
    }

    @Override
    public String toString(){
        if(this.att == 1){
            return "Descrizione: " + this.de + "\n" + this.d +" - " + this.t + "\n nessun problema";
        }else if(this.att == 2){
            return "Descrizione: " + this.de + "\n" + this.d +" - " + this.t + "\n annotazione";
        }else if(this.att == 3){
            return "Descrizione: " + this.de + "\n" + this.d +" - " + this.t + "\n evento moderato";
        }else if(this.att == 4){
            return "Descrizione: " + this.de + "\n" + this.d +" - " + this.t + "\n evento grave";
        }else if(this.att == 5){
            return "Descrizione: " + this.de + "\n" + this.d +" - " + this.t + "\n evento critico";
        }
    }
}
