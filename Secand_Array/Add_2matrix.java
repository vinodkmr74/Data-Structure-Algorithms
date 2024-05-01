package Secand_Array;

import java.util.Scanner;

public class Add_2matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix input");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter 2nd matrix input");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("first matrix output");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println(" ");
        }

        System.out.println("2nd matrix output");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println(" ");
        }

        System.out.println("addition");
        int sum[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                sum[i][j] = a[i][j] + b[i][j];

                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
