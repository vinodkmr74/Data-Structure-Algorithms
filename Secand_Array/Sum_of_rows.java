package Secand_Array;

import java.util.Scanner;

public class Sum_of_rows {

    public static void main(String[] args) {

        System.out.println("sum of row element");

        int sum[][] = { { 1, 5, 8, 6 }, { 7, 2, 5, 4 }, { 3, 6, 9, 2 }, { 5, 7, 4, 3 } };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(sum[i][j] + " ");

            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {

            int sum_row = 0;

            for (int j = 0; j < 4; j++) {

                sum_row += sum[i][j];
            }

            System.out.println("sum of " + i + 1 + " is: " + sum_row);

        }

    }

}