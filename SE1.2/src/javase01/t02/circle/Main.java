package javase01.t02.circle;
import java.util.Scanner;

/**
 * Created by Ekaterina on 06.03.16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println ("Введите значение ε: ");
        Scanner in = new Scanner (System.in);
        double eps = in.nextDouble();


        /*  Вопрос: почему данный код выкидывает Exeption при чтении данных с консоли?

        //String input = System.console ().readLine();
        //Double eps;

        //try {
            eps = Double.valueOf(input);
        }
        catch (NumberFormatException e) {
            System.err.println ("Неверный формат введенных данных!");
            return;
        } */

        int n = 1;
        double currentValue;


        do  {
            n = n + 1;
            currentValue = 1/Math.pow(n+1, 2);
            System.out.println ("a["+n+"]="+ currentValue);

        } while (currentValue >= eps);
        System.out.println ("Минимальный номер элемента последовательности равен " +n);

    }
}
