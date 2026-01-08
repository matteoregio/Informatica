import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fiore fiore = new Fiore();

        System.out.print("Giocatore 1, inserisci la parola: ");
        String parolaSegreta = in.nextLine().toLowerCase();

        for(int i = 0; i < 50; i++) {
            System.out.println();
        }

        char[] lettereGiuste = new char[parolaSegreta.length()];
        for (int i = 0; i < lettereGiuste.length; i++) {
            lettereGiuste[i] = '_';
        }

        String lettere = "";
        int errori = 0;
        final int MAX_ERRORI = 9;

        while (errori < MAX_ERRORI && !String.valueOf(lettereGiuste).equals(parolaSegreta)) {
            System.out.println("---------------------------");
            fiore.mostra(errori);

            System.out.print("Parola: ");
            for(char c : lettereGiuste) System.out.print(c + " ");

            System.out.println("Lettere provate: " + lettere);
            System.out.print("Inserisci lettera: ");
            char lettera = in.next().toLowerCase().charAt(0);

            if (parolaSegreta.indexOf(lettera) >= 0) {
                for (int i = 0; i < parolaSegreta.length(); i++) {
                    if (parolaSegreta.charAt(i) == lettera) lettereGiuste[i] = lettera;
                }
            } else {
                if (lettere.indexOf(lettera) == -1) {
                    lettere += lettera + " ";
                    errori++;
                } else {
                    System.out.println("Hai gia provato questa lettera!");
                }
            }
        }

        if (String.valueOf(lettereGiuste).equals(parolaSegreta)) {
            System.out.println("HAI VINTO!!! Hai indovinato: " + parolaSegreta);
        } else {
            fiore.mostra(errori);
            System.out.println("HAI PERSO (scemo) !!! La parola era: " + parolaSegreta);
        }
    }
}