package Secand_Array;

import java.util.Scanner;

/**
 * Transpose
 */
public class Transpose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enater a element");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int a[][] = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("traspose output");
        int tras[][] = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                tras[i][j] = a[j][i];

                System.out.print(tras[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
}