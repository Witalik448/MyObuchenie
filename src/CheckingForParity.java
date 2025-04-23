import java.util.Scanner;

public class CheckingForParity {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите число");
        int c = chislo.nextInt();
    }

    public int summ(int c) {
        return c % 2;
    }

    public void result() {
        System.out.println("Число четное" + summ(5));
    }
}
