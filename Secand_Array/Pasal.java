package Secand_Array;

import java.util.Scanner;

public class Pasal {

    static void printmarix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    static int[][] pascal(int n) {

        int output[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            output[i] = new int[i + 1];
            output[i][0] = output[i][i] = 1;

            for (int j = 1; j < i; j++) {
                output[i][j] = output[i - 1][j] + output[i - 1][j - 1];

            }
        }

        return output;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int output[][] = pascal(n);
        printmarix(output);

    }

}