import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String g;
        boolean m;
        Semaforo s = new Semaforo();
        int n;
        System.out.println("Inserisci 1 se vuoi accendere il semaforo");
        System.out.println("Inserisci 2 se vuoi spegnere il semaforo");
        System.out.println("Inserisci 3 se vuoi spegnere o accendere il semaforo");
        System.out.println("Inserisci 4 se vuoi avanzare il semaforo");
        System.out.println("Inserisci 5 se vuoi sapere lo stato del semaforo");
        System.out.println("Inserisci 6 se vuoi sapere il colore del semaforo");
        System.out.println("Inserisci 7 se vuoi stampare il semaforo");
        System.out.println("Inserisci 0 se vuoi uscire dal programma");
        n = in.nextInt();

        while(n != 0){
            if (n == 1){
                s.accendi();
            }
            if(n == 2){
                s.spegni();
            }
            if(n == 3){
                s.toggle();
            }
            if(n == 4){
                s.avanza();
            }
            if(n == 5){
                m = s.isAcceso();
                System.out.println(m);
            }
            if(n == 6){
                g = s.getColore();
                System.out.println(g);
            }
            if(n == 7){
                System.out.println(s.toString());
            }

            System.out.println("Inserisci 1 se vuoi accendere il semaforo");
            System.out.println("Inserisci 2 se vuoi spegnere il semaforo");
            System.out.println("Inserisci 3 se vuoi spegnere o accendere il semaforo");
            System.out.println("Inserisci 4 se vuoi avanzare il semaforo");
            System.out.println("Inserisci 5 se vuoi sapere lo stato del semaforo");
            System.out.println("Inserisci 6 se vuoi sapere il colore del semaforo");
            System.out.println("Inserisci 7 se vuoi stampare il semaforo");
            System.out.println("Inserisci 0 se vuoi uscire dal programma");

            n = in.nextInt();
        }










    }
}