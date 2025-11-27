public class Dado {
    private int n;

    public Dado(){
        this.n = 6;
    }

    public Dado(int n)throws DadoNonValido{
        if(n < 2 || n == 3){
            throw new DadoNonValido(n);
        }
        this.n = n;
    }

    public Dado(Dado d){
        this.n = d.n;
    }

    public int lancia(){
        int n = ((int) Math.random() * this.n + 1);
        return n;
    }

    public int getN(){
        return this.n;
    }

    @Override
    public String toString(){
        return "Il dado ha " + this.n + " facce";
    }


}
