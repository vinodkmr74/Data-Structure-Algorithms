package Secand_Array;

import java.util.Scanner;

public class subteraction {

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
        System.out.println("Enter 2nd matrix inptut");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first output");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("enter 2nd output");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Enter Subtection");
        int sub[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sub[i][j] = a[i][j] - b[i][j];

                System.out.print(sub[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
