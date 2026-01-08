import java.util.ArrayList;

public class Domanda {
    private String testo;
    private ArrayList<Risposta> opzioni;
    private int valore;
    private Integer rispostaUtente = null;

    public Domanda(String testo, ArrayList<Risposta> opzioni) {
        this.testo = testo;
        this.opzioni = opzioni;
        this.valore = 1;
    }

    public Domanda(Domanda altra) {
        this.testo = altra.testo;
        this.opzioni = new ArrayList<>(altra.opzioni);
        this.valore = altra.valore;
        this.rispostaUtente = null;
    }

    public boolean rispondi(int scelta) {
        if (scelta < 1 || scelta > opzioni.size()) {
            return false;
        }
        this.rispostaUtente = scelta;
        return opzioni.get(scelta - 1).corretta;
    }

    public void setValore(int valore) {
        if (valore >= 0) {
            this.valore = valore;
        }
    }

    public int getValore() {
        return valore;
    }

    public int getPunteggio() {
        if (rispostaUtente == null) {
            return -1;
        }
        return opzioni.get(rispostaUtente - 1).corretta ? valore : 0;
    }

    public boolean completata() {
        return rispostaUtente != null;
    }

    public String getRispostaCorretta() {
        for (Risposta r : opzioni) {
            if (r.corretta) {
                return r.testo;
            }
        }
        return "";
    }

    public String getRispostaData() {
        if (rispostaUtente == null) {
            return null;
        }
        return opzioni.get(rispostaUtente - 1).testo;
    }

    @Override
    public String toString() {
        String s = testo + "\n";
        for (int i = 0; i < opzioni.size(); i++) {
            s += (i + 1) + ") " + opzioni.get(i).testo + "\n";
        }
        return s;
    }
}