import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        LocalDate []d = new LocalDate[3];
        int g, g1, g2, m ,m1 ,m2, a, a1, a2, n;

        System.out.println("Inserisci tre giorni, tre mesi e tre anni");
        g = in.nextInt();
        g1 = in.nextInt();
        g2 = in.nextInt();
        m = in.nextInt();
        m1 = in.nextInt();
        m2 = in.nextInt();
        a = in.nextInt();
        a1 = in.nextInt();
        a2 = in.nextInt();

        LocalDate data1 = LocalDate.of(a, m, g);
        LocalDate data2 = LocalDate.of(a1, m1, g1);
        LocalDate data3 = LocalDate.of(a2, m2, g2);

        System.out.println("Inserisci 1 per il giorno");
        System.out.println("Inserisci 2 per il mese");
        System.out.println("Inserisci 3 per il anno");
        n = in.nextInt();

        if(n == 1){
            System.out.println("Inserisci un giorno");
            n = in.nextInt();
            if(n == data1.getDayOfMonth()){
                System.out.println(data1);
            }if(n == data2.getDayOfMonth()){
                System.out.println(data2);
            }if(n == data3.getDayOfMonth()){
                System.out.println(data3);
            }
        }

        if(n == 2){
            System.out.println("Inserisci un mese");
            n = in.nextInt();
            if(n == data1.getMonthValue()){
                System.out.println(data1);
            }if(n == data2.getMonthValue()){
                System.out.println(data2);
            }if(n == data3.getMonthValue()){
                System.out.println(data3);
            }
        }

        if(n == 3){
            System.out.println("Inserisci un anno");
            n = in.nextInt();
            if(n == data1.getYear()){
                System.out.println(data1);
            }if(n == data2.getYear()){
                System.out.println(data2);
            }if(n == data3.getYear()){
                System.out.println(data3);
            }
        }

    }
}