package Secand_Array;

import java.util.Scanner;

public class Test_two_d {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rows element");
        int rows = sc.nextInt();
        System.out.println("Enter a cols element");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                a[i][j] = sc.nextInt();

            }
        }
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.println(a[i][j] + " ");

            }

            System.out.println();
        }

    }

}