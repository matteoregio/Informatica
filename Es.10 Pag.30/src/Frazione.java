public class Frazione {
    private int n;
    private int d;

    public Frazione(){
        this.n = 0;
        this.d = 0;
    }

    public Frazione(int n, int d){
        if(d == 0){
            d = 1;
        }
        this.d = d;
        this.n = n;
    }

    public Frazione(Frazione f){
        this.n = f.n;
        this.d = f.d;
    }

    public int getD(){
        return this.d;
    }

    public int getN(){
        return this.n;
    }

    public void setN(int n){
        if(d == 0){
            return;
        }
        this.n = n;
    }

    public void setD(int d){
        this.d = d;
    }

    private static int MCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private void riduci(){
        int d = MCD(this.n, this.d);
        this.n = n/d;
        this.d = n/d;
    }

    public double toDouble(){
        return (double)this.n/(double) this.d;
    }

    public Frazione somma(Frazione f){
        Frazione z = new Frazione();
        z.d = this.d * f.getD();
        z.n = z.d*this.n + z.d*f.getN();
        z.riduci();
        return z;
    }

    public Frazione differenza(Frazione f){
        Frazione z = new Frazione();
        z.d = this.d * f.d;
        z.n = z.d*this.n - z.d*f.n;
        z.riduci();
        return z;
    }

    public Frazione prodotto(Frazione f){
        Frazione z = new Frazione();
        z.d = this.d * f.d;
        z.n = this.n * f.n;
        z.riduci();
        return z;
    }

    public Frazione quoziente(Frazione f){
        Frazione z = new Frazione();
        z.d = this.d * f.n;
        z.n = this.n * f.d;
        z.riduci();
        return z;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Frazione)){
            return false;
        }
        Frazione f = (Frazione) o;
        double c = f.toDouble();
        double d = this.n / this.d;
        if(c == d){
            return true;
        }else return false;
    }

    @Override
    public String toString(){
        if(this.d == 1){
            return this.n + "";
        }else{
            return this.n + "/" + this.d;
        }
    }
}

