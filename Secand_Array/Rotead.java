package Secand_Array;

import java.util.Scanner;

/**
 * Rotead
 */
public class Rotead {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a matrix element");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int Rotead[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Rotead[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(Rotead[i][j] + " ");
            }
            System.out.println(" ");

        }
        // int tem;
        System.out.println("transpose");

        int sowp[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                sowp[i][j] = Rotead[j][i];

                System.out.print(sowp[i][j] + " ");

            }
            System.out.println(" ");
        }
        int temp;
        System.out.println("Roteated");
        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                if (i <= j) {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println(" ");
            }

        }

    }
}
