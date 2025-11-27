import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero di facce che deve avere il dado");
        int n = in.nextInt();
        try{
            Dado d = new Dado(n);
        }catch(DadoNonValido b){
            System.out.println(b.toString());
        }

    }
}