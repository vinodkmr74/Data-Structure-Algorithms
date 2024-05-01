package Secand_Array;

import java.util.Scanner;

public class Rectengle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int Rec[][] = new int[r][c];
        int totalelement = r * c;
        System.out.println("tataelement: " + totalelement);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Rec[i][j] = sc.nextInt();
            }

        }

        // System.out.println("output");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // System.out.print(Rec[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

        System.out.println("sum bound");

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int sm = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {

                sm += Rec[i][j];
            }
            System.out.print("sum= " + sm + " ");

            System.out.println(" ");
        }
    }

}