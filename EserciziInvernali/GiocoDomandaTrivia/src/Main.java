import java.io.*;
import java.util.*;

public class Main {

    private static ArrayList<Domanda> caricaDomande(String nomeFile) {
        ArrayList<Domanda> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parti = linea.split(";");
                ArrayList<Risposta> opzioni = new ArrayList<>();
                int giusta = Integer.parseInt(parti[5]);

                for (int i = 1; i <= 4; i++) {
                    opzioni.add(new Risposta(parti[i], i == giusta));
                }
                lista.add(new Domanda(parti[0], opzioni));
            }
        } catch (Exception e) {
            System.out.println("Errore!!");
        }
        return lista;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> categorie = new ArrayList<>(Arrays.asList("cultura", "sport", "storia", "cibo", "matematica", "scienze"));
        ArrayList<ArrayList<Domanda>> database = new ArrayList<>();

        for (String cat : categorie) {
            database.add(caricaDomande(cat + ".txt"));
        }

        int risposteCorrette = 0;
        boolean flag = true;
        Random r = new Random();

        System.out.println("--- TRIVIAL PURSUIT ---");

        while (flag) {
            int i1 = r.nextInt(categorie.size());
            int i2 = 0;

            while(i1 == i2){
                i2 = r.nextInt(categorie.size());
            }

            System.out.println("\nScegli la categoria:");
            System.out.println("1) " + categorie.get(i1));
            System.out.println("2) " + categorie.get(i2));

            int sceltaUtente = in.nextInt();
            int indiceScelto = (sceltaUtente == 1) ? i1 : i2;

            ArrayList<Domanda> listaDomande = database.get(indiceScelto);
            Domanda d = listaDomande.get(r.nextInt(listaDomande.size()));

            System.out.println("\n" + d.toString());
            System.out.print("La tua risposta (1-4): ");
            int risp = in.nextInt();

            if (d.rispondi(risp)) {
                System.out.println("ESATTO!");
                risposteCorrette++;
            } else {
                System.out.println("ERRORE! La risposta corretta era: " + d.getRispostaCorretta());
                flag = false;
            }
        }

        System.out.println("\nFINE GIOCO. Punteggio totale: " + risposteCorrette);
    }
}