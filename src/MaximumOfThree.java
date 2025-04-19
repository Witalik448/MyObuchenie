import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner chisla = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int numm1 = chisla.nextInt();
        int numm2 = chisla.nextInt();
        int numm3 = chisla.nextInt();

        int max = numm1;

        if (numm2 > max) ;
        max = numm2;

        if(numm3 > max);
        max = numm3;

        System.out.println("Наибольшее число: " + max);
    }

}