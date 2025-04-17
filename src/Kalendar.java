import java.util.Scanner;

public class Kalendar {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("Введите цифру дня недели: ");
        day.nextInt();
        int daeNed = 0;


        switch (daeNed) {
            case 1:
                System.out.println("Понидельник: ");
                break;
            case 2:
                System.out.println("Вторник: ");
                break;
            case 3:
                System.out.println("Среда: ");
                break;
            case 4:
                System.out.println("Четверг: ");
                break;
            case 5:
                System.out.println("Пятница: ");
                break;
            case 6:
                System.out.println("Суббота: ");
                break;
            case 7:
                System.out.println("Воскрисенье: ");
                break;
            default:
                System.out.println("Ошибка:  введите число от 1 до 7");
        }
        day.close();
    }
}
