package Secand_Array;

import java.util.Scanner;

public class multi_matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix input");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 2nd element matrix input");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int b[][] = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("first output");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("2nd output");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("mul");
        int mul[][] = new int[rows][cols1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols1; j++) {

                for (int k = 0; k < rows1; k++) {

                    // if (rows != cols1) {
                    // System.out.println("worng");
                    // }

                    mul[i][j] += a[i][k] * b[k][j];

                    System.out.print(mul[i][j] + " ");

                }
                System.out.println(" ");
            }
        }
    }

}