package Array;

import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbre");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("output: " + a[i]);
        }

    }

}
