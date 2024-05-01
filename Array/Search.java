package Array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Element");

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter a Search number");
        int search = sc.nextInt();

        for (int i = 0; i < a.length; i++) {

            if (a[i] == search) {

                System.out.println(i);
            }

        }

    }

}
