public class Playlist {
    private String n;
    private int N;
    private int b;
    private String stato;
    private int conta = 0;
    private Canzone []c = new Canzone [100];

    public Playlist(String n,int N){
        this.n = n;
        this.N = N;
        this.b = 1;
        this.stato = "STOP";
    }

    public Playlist(String n, Canzone[]c){
        this.n = n;
        this.c = c;
        this.stato = "STOP";
    }

    public Playlist(Playlist p){
        this.n = p.n;
        this.N = p.N;
        this.b = p.b;
        this.stato = p.stato;
    }

    public String getNome() {
        return n;
    }

    public int getQuantiBrani() {
        return N;
    }

    public void play(){
        this.stato = "PLAY";
        this.conta = 0;
    }

    public void pause(){
        if(!(this.stato.equals("STOP"))){
            this.stato = "PLAY";
        }
    }

    public void stop(){
        this.stato = "STOP";
        conta++;
    }

    public void branoSuccessivo(){
        if(this.b == this.N){
            this.b = 1;
        }else this.b++;
    }

    public void branoPrecedente(){
        if(this.b == 1){
            this.b = this.N;
        }else this.b--;
    }

    public Canzone getCanzone(int n){
        if(n < 0 || n > 100){
            return this.c[n];
        }else return null;
    }

    public boolean add(Canzone canzone){
        if(this.c.length() >){

        }
        this.c += canzone;
    }

    public float durataTotale(){
        int m, s;
        for (int i = 0; i < this.c.length(); i++) {

        }
    }

    @Override
    public String toString(){
        return "Playlist " + this.n + ", " + this.N + " brani, in" + this.stato + "sul brano " + this.b;
    }
}
