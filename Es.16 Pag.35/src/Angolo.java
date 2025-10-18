public class Angolo {
    private int g;
    private int p;
    private int s;

    public Angolo(){
        this.g = 0;
        this.p = 0;
        this.s = 0;
    }

    public Angolo(int g, int p, int s){
        if(g > 359){
            g = 360 - g;
        }if(p > 59){
            p = 60 - p;
        }if(s > 59){
            s = 60 - s;
        }
        this.g = g;
        this.p = p;
        this.s = s;
    }

    public Angolo(float a){
        this.g = (int)a;
        float ap = this.g;
        this.s = (int)ap * 60;
        this.p = this.s * 60;
    }

    public int getG() {
        return this.g;
    }

    public int getP() {
        return p;
    }

    public int getS() {
        return s;
    }

    public Angolo somma(Angolo a){
        Angolo m = new Angolo();
        m.g = this.g + a.g;
        m.p = this.p + a.p;
        m.s = this.s + a.s;
        if(m.p > 59){
            m.g++;
            m.p = m.p - 60;
        }
        if(m.s > 59){
            m.p++;
            m.s = m.s - 60;
        }
        return m;
    }

    public Angolo differenza(Angolo a){
        Angolo m = new Angolo();
        m.g = this.g - a.g;
        m.p = this.p - a.p;
        m.s = this.s - a.s;

        return m;
    }

    public double getRadianti(){
        double d;
        d = (this.g + (double)(this.p/60) + (double)(this.s/3600)) * 3.14/180;
        return d;
    }

    @Override
    public String toString(){
        return this.g + "°" + this.p + "'" + this.s + '"';

    }


}
