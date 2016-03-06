package javase01.t04.dimarray;
import java.util.Scanner;


/**
 * Created by Ekaterina on 06.03.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println ("Введите количество элементов последовательности n: ");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        double[] array = new double [n];


        for (int i=0; i < n; i++) {
            System.out.println("Введите элемент последовательности a: ");
            array[i] = in.nextDouble();
        }

        double [] newArray = new double [n];

        for (int j=0; j < n; j++) {
            newArray[j] = array[j] + array[n - j - 1];
        }
        double max=newArray[0];
        for (int j = 1; j < n; j++) {
            if (newArray [j] > max) {
                max = newArray [j];
            }
        }

        System.out.println("Максимальное значение равно " + max);

    }
}