import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int []v = new int [50];
        int n;
        System.out.println("Inserisci un numero < di 50");
        n = in.nextInt();

        for (int i = n-1; i >= 0; i--) {
            v[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + "-");
        }

    }
}