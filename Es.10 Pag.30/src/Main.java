import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, d, b;
        double p;
        System.out.println("Inserisci il num");
        n = in.nextInt();
        System.out.println("Inserisci il den");
        d = in.nextInt();
        Frazione f = new Frazione(n, d);
        Frazione c;

        System.out.println("Inserisci 1 se vuoi ottenere la divisone tra num e den");
        System.out.println("Inserisci 2 se vuoi fare la somma con un altra frazione");
        System.out.println("Inserisci 3 se vuoi fare la differenza con un altra frazione");
        System.out.println("Inserisci 4 se vuoi fare la prodotto con un altra frazione");
        System.out.println("Inserisci 5 se vuoi fare la quoziente con un altra frazione");
        System.out.println("Inserisci 6 se vuoi controllare se due frazioni sono uguali");
        System.out.println("Inserisci 7 se vuoi stampare una frazione");
        System.out.println("Inserisci 0 se vuoi finire il programma");
        b = in.nextInt();

        while(b != 0){
            if(b == 1) {
                p = f.toDouble();
                System.out.println(p);
            }
            if(b == 2){
                System.out.println("Inserisci il num");
                n = in.nextInt();
                System.out.println("Inserisci il den");
                d = in.nextInt();
                c = new Frazione(n, d);
                System.out.println(f.somma(c));
            }
            if(b == 3){
                System.out.println("Inserisci il num");
                n = in.nextInt();
                System.out.println("Inserisci il den");
                d = in.nextInt();
                c = new Frazione(n, d);
                System.out.println(f.differenza(c));
            }
            if(b == 4){
                System.out.println("Inserisci il num");
                n = in.nextInt();
                System.out.println("Inserisci il den");
                d = in.nextInt();
                c = new Frazione(n, d);
                System.out.println(f.prodotto(c));
            }
            if(b == 5){
                System.out.println("Inserisci il num");
                n = in.nextInt();
                System.out.println("Inserisci il den");
                d = in.nextInt();
                c = new Frazione(n, d);
                System.out.println(f.quoziente(c));
            }
            if(b == 6){
                System.out.println("Inserisci il num");
                n = in.nextInt();
                System.out.println("Inserisci il den");
                d = in.nextInt();
                c = new Frazione(n, d);
                System.out.println(f.equals(c));
            }
            if(b == 7){
                System.out.println(f.toString());
            }

            System.out.println("Inserisci 1 se vuoi ottenere la divisone tra num e den");
            System.out.println("Inserisci 2 se vuoi fare la somma con un altra frazione");
            System.out.println("Inserisci 3 se vuoi fare la differenza con un altra frazione");
            System.out.println("Inserisci 4 se vuoi fare la prodotto con un altra frazione");
            System.out.println("Inserisci 5 se vuoi fare la quoziente con un altra frazione");
            System.out.println("Inserisci 6 se vuoi controllare se due frazioni sono uguali");
            System.out.println("Inserisci 7 se vuoi stampare una frazione");
            System.out.println("Inserisci 0 se vuoi finire il programma");
            b = in.nextInt();
        }




    }
}