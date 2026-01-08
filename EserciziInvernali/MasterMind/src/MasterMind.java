import java.util.ArrayList;

public class MasterMind {
    private Sequenza segreta;
    private ArrayList<Sequenza> tentativi;
    private int maxTentativi;

    public MasterMind() {
        this.segreta = new Sequenza();
        this.tentativi = new ArrayList<>();
        this.maxTentativi = 10;
    }

    public void add(Sequenza s) {
        if (tentativi.size() < maxTentativi) {
            tentativi.add(s);
        }
    }

    public boolean vittoria() {
        if (tentativi.isEmpty()) {
            return false;
        }

        Sequenza ultimo = tentativi.get(tentativi.size() - 1);
        if (ultimo.equals(segreta)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean terminato() {
        if (vittoria()) {
            return true;
        }

        if (tentativi.size() >= maxTentativi) {
            return true;
        }

        return false;
    }
    public Sequenza getSegreta() {
        return segreta;
    }

    @Override
    public String toString() {
        String res = "Stato Partita:";
        for (int i = 0; i < tentativi.size(); i++) {
            Sequenza t = tentativi.get(i);
            res += (i + 1) + ") " + t.toString() + " | Indizio: " + segreta.confronta(t).toString();
        }
        return res;
    }
}