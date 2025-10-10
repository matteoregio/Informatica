import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, x, y;
        System.out.println("Inserisci la x e la y");
        x = in.nextInt();
        y = in.nextInt();
        Punto p = new Punto(x, y);
        System.out.println("Inserisci 1 se vuoi la distanza da un altro punto");
        System.out.println("Inserisci 2 se vuoi il punto medio");
        System.out.println("Inserisci 3 se stampare il punto");
        n = in.nextInt();

        while(n != 0){

            if(n == 1){
                int x1, y1;
                System.out.println("Inserisci la x e la y");
                x1 = in.nextInt();
                y1 = in.nextInt();
                Punto c = new Punto(x1, y1);
                System.out.println(p.distanza(c));
            }

            if(n == 2){
                int x2, y2;
                System.out.println("Inserisci la x e la y");
                x2 = in.nextInt();
                y2 = in.nextInt();
                Punto c = new Punto(x2, y2);
                System.out.println(p.distanza(c));
            }

            if(n == 3){
                System.out.println(p.toString());
            }

            System.out.println("Inserisci 1 se vuoi la distanza da un altro punto");
            System.out.println("Inserisci 2 se vuoi il punto medio");
            System.out.println("Inserisci 3 se stampare il punto");
            n = in.nextInt();
        }

    }
}