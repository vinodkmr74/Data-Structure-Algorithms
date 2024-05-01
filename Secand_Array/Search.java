package Secand_Array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rowa element");
        int rows = sc.nextInt();
        System.out.println("Enter a cols element");
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a search eement");
        int search = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == search) {
                    System.out.println("location(" + i + "," + j + ")");
                }
            }
        }

    }

}
