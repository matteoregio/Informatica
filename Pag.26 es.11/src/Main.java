import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n, f;
        System.out.println("Inserisci un numero compreso tra un miliardo e due miliardi");
        n = in.nextDouble();
        System.out.println("Inserisci un numero compreso tra un miliardo e due miliardi");
        f = in.nextDouble();

        System.out.println("Somma: " + (n+f) + " Differenza: " + (n-f) + " Prodotto: " + (n*f));
    }
}