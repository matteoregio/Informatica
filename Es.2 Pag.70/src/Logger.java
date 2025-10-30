import java.time.LocalDate;
import java.time.LocalTime;

public class Logger {
    private Azione []v;

    public Logger(int n){
        this.v = new Azione[n];
    }

    public void add(Azione a){
        this.v = this.v + a;
    }

    public Azione getA(int n){
        if(n > this.v.length){
            return null;
        }
        return this.v[n];
    }

    public Azione[] getByAttenzione(int a){
        Azione []b = new Azione[this.v.length];
        int conta = 0;
        for (int i = 0; i < this.v.length; i++) {
            if(v[i].getAtt() == a){
                b[conta] = this.v[i];
                conta++;
            }
        }
        return b;
    }

    public int size(){
        return this.v.length;
    }

    public boolean isEmpty(){
        if(this.v.length == 0){
            return true;
        }else return false;
    }

    @Override
    public String toString(){
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0 ,c5 = 0;
        LocalDate d1 = this.v[0].getD(), d2 = this.v[this.v.length-1].getD();
        LocalTime t1 = this.v[0].getT(), t2 = this.v[this.v.length-1].getT();
        for (int i = 0; i < this.v.length; i++) {
            if(this.v[i].getAtt() == 1){
                c1++;
            }else if(this.v[i].getAtt() == 2){
                c2++;
            }else if(this.v[i].getAtt() == 3){
                c3++;
            }else if(this.v[i].getAtt() == 4){
                c4++;
            }else if(this.v[i].getAtt() == 5){
                c5++;
            }
        }

        return "Numero di azioni totali " + this.v.length + "\n Livello 1: " + c1 + "\n Livello 2: " + c2 + "\n Livello 3: " + c3 + "\nLivello 4: " + c4 + "\n Livello 5: " + c5 + "\n dalle ore " + t1 + " del " + d1 + "\n fino alle ore " + t2 + " del " + d2;
    }


}
