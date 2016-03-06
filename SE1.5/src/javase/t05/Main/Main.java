package javase.t05.Main;
import java.util.Scanner;

/**
 * Created by Ekaterina on 06.03.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println ("Введите размерность матрицы n: ");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix [i][i] = 1;
            matrix [i][n-i-1]=1;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
