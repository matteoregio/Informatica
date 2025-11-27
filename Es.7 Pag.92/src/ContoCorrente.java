public class ContoCorrente {
    private String nome;
    private String cognome;
    private int IBAN;
    private int saldo = 400;

    public ContoCorrente(String nome, String cognome, int IBAN){
        this.nome = nome;
        this.cognome = cognome;
        this.IBAN = IBAN;
    }

    public int preleva(int n)throws AzioneNonValida{
        if(n < 0 || this.saldo - n < 0){
            String m = "Il prelievo non è valido perchè la somma inserita è maggiore del saldo";
            throw new AzioneNonValida(m);
        }
        this.saldo -= n;
        return this.saldo;
    }

    public int deposita(int n)throws AzioneNonValida{
        if(n < 0){
            String m = "Il deposito non è valido perchè la somma inserita è un parametro non valido";
            throw new AzioneNonValida(m);
        }
        this.saldo += n;
        return this.saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public int getIBAN() {
        return IBAN;
    }

    public String getNominativo(){
        return this.nome + " " + this.cognome;
    }

    @Override
    public String toString(){
        return "Informazioni: " + this.nome + " " + this.cognome + ", " + this.saldo + ", " + this.IBAN;
    }
}
