public class Indizio {
    private int b;
    private int n;

    public Indizio(int b, int n){
        this.b = b;
        this.n = n;

    }

    public int getNeri(){
        return this.n;
    }

    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < this.b; i++) {
            s += "b ";
        }
        for (int i = 0; i < this.n; i++) {
            s += "n ";
        }
        return s;
    }
}
