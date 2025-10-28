public class TazzaPerDadi {
    private int ndadi;
    private int nfacce;
    private int dadimax;

    public TazzaPerDadi(int ndadi){
        this.ndadi = ndadi;
    }

    public TazzaPerDadi(int n, int f){
        this.ndadi = n;
        this.nfacce = f;
    }

    public boolean add(){
        if(this.ndadi == this.dadimax){
            return false;
        }
        this.ndadi++;
        return true;
    }

    public int quanti(){
        return this.ndadi;
    }

    public int size(){
        return this.dadimax;
    }

    public boolean isEmpty(){
        if(this.ndadi == 0){
            return true;
        }else return false;
    }

    public int getMax(){

    }




}
