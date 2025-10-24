import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int []v = new int [10];
        int []l = new int[10];
        int []n = new int[10];
        int a, b, ai = 0, bi = 0;
        System.out.println("Inserisci num piccolo");
        a = in.nextInt();
        System.out.println("Inserisci num grande");
        b = in.nextInt();
        int m = (a + b)/2;
        
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random() * (b - a - 1) + a);
        }

        for (int i = 0; i < v.length; i++) {
            if(v[i] > a || v[i] < m){
                l[ai] = v[i];
                ai++;
            }else if(v[i] > m+1 || v[i] < b){
                n[bi] = v[i];
                bi++;
            }
        }

        for (int i = 0; i < ai; i++) {
            System.out.print(l[i] + "-");
        }

        System.out.println();

        for (int i = 0; i < bi; i++) {
            System.out.print(n[i] + "-");
        }
        

    }
}