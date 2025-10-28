public class Canzone {
    private String titolo;
    private float duration;
    private String artista;

    public Canzone(String titolo, int duration, String artista) {
        this.titolo = titolo;
        this.duration = duration;
        this.artista = artista;
    }

    public float getDuration() {
        return this.duration;
    }

    public String getTitolo(){
        return this.titolo;
    }

    public String getArtista(){
        return this.artista;
    }

    @Override
    public String toString (){
        return "Titolo: " + this.titolo + "\n" + "Durata: " + (int)this.duration + "minuti e " + this.duration % (int)this.duration + "secondi \n Artista: " + this.artista;
    }
}
