package Secand_Array;

import java.util.Scanner;

public class Transpose_sowping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a inpute element");

        int row = sc.nextInt();
        int cols = sc.nextInt();
        int a[][] = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

            }
        }

        System.out.println("tranpose output");
        for (int i = 0; i < row; i++) {

            for (int j = i; j < cols; j++) {

                int temp;

                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

                System.out.print(a[j][i] + " ");

            }

            System.out.println("");
        }
    }
}
