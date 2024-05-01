package Secand_Array;

import java.util.Scanner;

public class Reverce {

    public static void main(String args[]) {

        // int n[][] = { { 72, 371, 5 }, { 12, 6, 426 }, { 5, 123, 94 } };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m = sc.nextInt();
        int n[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                n[i][j] = sc.nextInt();

            }

        }

        int rev = 0;
        // int rem;
        System.out.println("output");
        for (int i = 0; i < m; i++) {

            // int rev = 0;

            for (int j = 0; j < m; j++) {
                while (n[i][j] != 0) {

                    rev = rev * 10 + n[i][j] % 10;

                    n[i][j] = n[i][j] / 10;

                }
                // System.out.println(rev);
                System.out.print("rev: " + rev);

            }
            System.out.println(" ");
            break;
        }

    }

}
