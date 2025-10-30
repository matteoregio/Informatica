import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int g, m, a;
        System.out.println("Inserisci il giorno, mese e anno");
        g = in.nextInt();
        m = in.nextInt();
        a = in.nextInt();
        LocalDate oggi = LocalDate.of(a, m, g);
        LocalDate anno = LocalDate.of(a, m, g);
        anno = anno.plusDays(1);
        anno = anno.plusMonths(1);
        anno = anno.plusYears(1);

        System.out.println(oggi);
        System.out.println(anno);

    }
}