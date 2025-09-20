import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String n, c, p, n1, c1, p1, e, e1;
        System.out.println("Inserisci un nome un cognome e un provider di email: ");
        n = in.next();
        c = in.next();
        p = in.next();
        System.out.println("Inserisci un nome un cognome e un provider di email: ");
        n1 = in.next();
        c1 = in.next();
        p1 = in.next();

        e = n + c + "@" + p;
        e1 = n1 + c1 + "@"+ p1;

        if(e.equals(e1)){
            System.out.println("Le email sono uguali!!!");
        }else{
            System.out.println("Le email sono diverse");
        }


    }
}