import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci nome, cognome e IBAN");
        String n = in.next();
        String b = in.next();
        int IBAN = in.nextInt();
        ContoCorrente c = new ContoCorrente(n, b, IBAN);

        try{
            System.out.println("Quanto vuoi prelevare: ");
            int d = in.nextInt();
            c.preleva(d);
        }catch(AzioneNonValida a){
            System.out.println(a.toString());
        }

        try{
            System.out.println("Quanto vuoi depositare: ");
            int d = in.nextInt();
            c.deposita(d);
        }catch(AzioneNonValida a){
            System.out.println(a.toString());
        }

    }
}