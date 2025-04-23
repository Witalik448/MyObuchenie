import java.util.Scanner;

public class DefinitionsOfDays {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ведите время");
        int time = t.nextInt();

        if (time <= 5) {
            System.out.println("Ночь");
        }else if (time <= 11) {
            System.out.println("Утро");
        }else if (time <= 17) {
            System.out.println("День");
        }else if (time <= 23) {
            System.out.println("Вечер");
        }
    }

}
