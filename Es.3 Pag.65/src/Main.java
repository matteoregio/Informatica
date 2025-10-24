import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int []v = new int[10];
        System.out.println("-------------------------------");
        System.out.println("0  1  2  3  4  5  6  7  8  9");
        System.out.println("-------------------------------");

        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random() * 100) + 1;
            System.out.print(v[i] + " ");
        }


    }
}