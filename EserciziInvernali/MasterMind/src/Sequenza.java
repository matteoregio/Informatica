import java.util.ArrayList;
import java.util.Random;

public class Sequenza {
    private ArrayList<Integer> colori;
    private String[] NOMI_COLORI = {"B", "N", "V", "G", "R", "A"};

    public Sequenza() {
        colori = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            colori.add(r.nextInt(6));
        }
    }

    public Sequenza(int c1, int c2, int c3, int c4) {
        colori = new ArrayList<>();
        colori.add(c1); colori.add(c2); colori.add(c3); colori.add(c4);
    }

    public Indizio confronta(Sequenza altra) {
        int neri = 0;
        int bianchi = 0;
        ArrayList<Integer> copiaQuesta = new ArrayList<>(this.colori);
        ArrayList<Integer> copiaAltra = new ArrayList<>(altra.colori);

        for (int i = 3; i >= 0; i--) {
            if (copiaQuesta.get(i).equals(copiaAltra.get(i))) {
                neri++;
                copiaQuesta.remove(i);
                copiaAltra.remove(i);
            }
        }

        for (int i = 0; i < copiaAltra.size(); i++) {
            int idx = copiaQuesta.indexOf(copiaAltra.get(i));
            if (idx != -1) {
                bianchi++;
                copiaQuesta.remove(idx);
            }
        }
        return new Indizio(bianchi, neri);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Sequenza)) return false;
        Sequenza altra = (Sequenza) obj;
        return this.colori.equals(altra.colori);
    }

    @Override
    public String toString() {
        String s = "";
        for (int c : colori) s += NOMI_COLORI[c] + " ";
        return s;
    }
}