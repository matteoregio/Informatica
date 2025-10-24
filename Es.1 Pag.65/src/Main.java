import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] v = new int [10];
        int [] p = new int[10];
        int [] d = new int[10];
        int ip=0, id=0;
        System.out.println("Quanti numeri vuoi inserire");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci il num");
            v[i] = in.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if(i % 2 == 0){
                p[ip] = v[i];
                ip++;
            }else{
                d[id] = v[i];
                id++;
            }
        }

        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "-");
        }
        System.out.println();
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + "-");
        }

}
}