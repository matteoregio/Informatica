import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un intero");
        int n;
        n = in.nextInt();
        System.out.println("Inserisci un float");
        float f;
        f = in.nextFloat();
        System.out.println("Inserisci un double");
        double d;
        d = in.nextDouble();

        System.out.println("Double: " + d + " Float: " + f + " Int: " + n);

    }
}