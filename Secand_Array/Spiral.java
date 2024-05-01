package Secand_Array;

import java.util.Scanner;

public class Spiral {

    static void printMatrix(int spiral[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(spiral[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    static void spiralMatrix(int spiral[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftcol = 0, rightcol = c - 1;

        int totalelement = 0;
        while (totalelement < r * c) {

            // topRow -> leftcol to rightcol

            for (int j = leftcol; j <= rightcol && totalelement < r * c; j++) {
                System.out.print(spiral[topRow][j] + " ");
                totalelement++;
            }
            topRow++;

            // rightcol ->topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalelement < r * c; i++) {
                System.out.print(spiral[i][rightcol] + " ");
                totalelement++;

            }
            rightcol--;

            // bottomRow -> rightcol to leftcol
            for (int j = rightcol; j >= leftcol && totalelement < r * c; j--) {
                System.out.print(spiral[bottomRow][j] + " ");
                totalelement++;
            }
            bottomRow--;

            // leftcol -> bottomRow to topRow

            for (int i = bottomRow; i >= topRow && totalelement < r * c; i--) {
                System.out.print(spiral[i][leftcol] + " ");
                totalelement++;

            }
            leftcol++;

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number matrix ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int spiral[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                spiral[i][j] = sc.nextInt();
            }
        }
        System.out.println("input");
        printMatrix(spiral, r, c);

        System.out.println("spiral");
        spiralMatrix(spiral, r, c);

    }

}
