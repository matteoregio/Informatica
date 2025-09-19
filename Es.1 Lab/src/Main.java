import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 60; i++) {
            if(i%2!=0){
                System.out.print(i + "-");
            }
        }

    }
}