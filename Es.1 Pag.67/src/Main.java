import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate oggi = LocalDate.now();
        LocalDate anno = LocalDate.now();
        anno = anno.plusDays(1);
        anno = anno.plusMonths(1);
        anno = anno.plusYears(1);

        System.out.println(oggi);
        System.out.println(anno);

    }
}