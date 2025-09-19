import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float f;
        System.out.println("Inserisci un float");
        f = in.nextFloat();
        f= f/1000000000;

        System.out.println(f);

    }
}