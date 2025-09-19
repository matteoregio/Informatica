import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s;
        System.out.println("Inserisci una parola");
        s = in.next();

        for (int i = s.length()-1 ; i >= 0 ; i--) {
            System.out.print(s.charAt(i));
        }

    }
}