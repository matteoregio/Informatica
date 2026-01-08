import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MasterMind gioco = new MasterMind();

        System.out.println("MASTERMIND - Indovina la sequenza di 4 colori!");
        System.out.println("Colori: 0:Bianco, 1:Nero, 2:Verde, 3:Giallo, 4:Rosso, 5:Arancione");

        while (!gioco.terminato()) {
            System.out.println("\nInserisci 4 numeri separati da spazio (es: 0 2 3 5):");
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            gioco.add(new Sequenza(c1, c2, c3, c4));
            System.out.println(gioco.toString());
        }

        if (gioco.vittoria()) {
            System.out.println("COMPLIMENTI! Hai vinto.");
        } else {
            System.out.println("HAI PERSO! La sequenza era: " + gioco.getSegreta());
        }
    }
}