import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2, n3;
        System.out.println("Inserisci un numero");
        n1 = in.nextInt();
        System.out.println("Inserisci un numero");
        n2 = in.nextInt();
        System.out.println("Inserisci un numero");
        n3 = in.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("Il maggiore è: " + n1);
        }
        if(n2 > n1 && n2 > n3){
            System.out.println("Il maggiore è: " + n2);
        }
        if(n3 > n1 && n3 > n2){
            System.out.println("Il maggiore è: " + n3);
        }

    }
}