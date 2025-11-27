public class AzioneNonValida extends Exception{
    private String messaggio;

    public AzioneNonValida(String m){
        this.messaggio = m;
    }

    @Override
    public String toString(){
        return this.messaggio;
    }
}
