import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введи число");
        int chislo = text.nextInt();

        if (chislo % 2 == 0) {
            System.out.println("Число чётное");
        }else {
            System.out.println("Чилос нечётное");
        }

    }


}
