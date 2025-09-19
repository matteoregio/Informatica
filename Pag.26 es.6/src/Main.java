import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int n;
        n = in.nextInt();
        float f = (n%10)*3;
        System.out.println("Numero moltiplicato per 100: " + n*100 + " Numero diviso per 10: " + n/10 + " Resto della divisione per 3: " + f);

    }
}