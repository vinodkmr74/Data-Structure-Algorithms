package Secand_Array;

import java.util.Scanner;

public class Second_heght {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rows element");
        int rows = sc.nextInt();
        System.out.println("Enter a cols element");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        int tem;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; i < cols; j++) {

                for (int k = i + 1; k < rows; k++) {
                    for (int n = j + 1; n < cols; n++)

                    {
                        if (a[i][j] < a[k][n]) {

                            tem = a[i][j];

                            a[i][j] = a[k][n];

                            a[k][n] = tem;
                        }

                        System.out.println("second height element: " + a[k][n]);
                    }

                }

            }
        }

    }

}
