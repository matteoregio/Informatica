public class Frazione {
    private int n;
    private int d;

    public Frazione(){
        this.n = 0;
        this.d = 0;
    }

    public Frazione(int n, int d){
        if(this.d == 0){
            this.d = 1;
        }
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
        double d = this.n/this.d;
        return d;
    }

    public Frazione somma(Frazione f){

    }
}
