import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int []v = new int [10];
        int a = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
            a++;
            if(v[i] < 0){
                break;
            }
        }

        for (int i = a-1; i >= 0; i--) {
            System.out.print(v[i] + "-");
        }

    }
}