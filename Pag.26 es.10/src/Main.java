import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, f;
        System.out.println("Inserisci un numero compreso tra un miliardo e due miliardi");
        n = in.nextInt();
        System.out.println("Inserisci un numero compreso tra un miliardo e due miliardi");
        f = in.nextInt();

        System.out.println("Somma: " + (n+f) + " Differenza: " + (n-f) + " Prodotto: " + (n*f));
    }
}