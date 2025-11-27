public class DadoNonValido extends Exception{
    private int n;

    public DadoNonValido(int n){
        this.n = n;
    }

    @Override
    public String toString(){
        return "Il dado non è stato creato perche il numero di facce era uguale a: " + this.n;

    }
}
