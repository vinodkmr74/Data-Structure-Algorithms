package Secand_Array;

import java.util.Scanner;

public class Diagonal {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n rows matrix");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        int suml = 0, sumr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    suml += matrix[i][j];

                }
                if (i + j == n - 1) {
                    sumr += matrix[i][j];
                }
            }

        }
        System.out.println("sum of left diagonal : " + suml);
        System.out.println("sum of right diagonal : " + sumr);

    }

}
