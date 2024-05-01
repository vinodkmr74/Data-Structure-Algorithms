package Secand_Array;

import java.util.Scanner;

public class Interchange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int n = sc.nextInt();

        int inter[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inter[i][j] = sc.nextInt();

            }
        }

        System.out.println("interchange element");
        int tem;

        for (int i = 0; i < n; i++) {
            tem = inter[i][i];
            inter[i][i] = inter[i][n - i - 1];
            inter[i][n - i - 1] = tem;

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(inter[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
