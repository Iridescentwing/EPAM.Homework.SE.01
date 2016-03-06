package javase.t03.table;
import java.util.Scanner;

/**
 * Created by Ekaterina on 06.03.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println ("Введите значение аргумента a: ");
        Scanner in = new Scanner (System.in);
        double a = in.nextDouble();

        System.out.println ("Введите значение аргумента b: ");
        double b = in.nextDouble();

        System.out.println ("Введите значение шага h: ");
        double h = in.nextDouble();

        System.out.printf ("|| %9s       || %13s   ||\n", "X", "F (x)");


        for (double x = a; x < b; x = x + h) {
            double fX = Math.tan (2*x) - 3;
            System.out.printf ("|| %15.10f || %15.10f ||\n", x, fX);

        }

    }
}
