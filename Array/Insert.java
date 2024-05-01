package Array;

import java.util.Scanner;

public class Insert {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a index Value");
        int nd = sc.nextInt();
        System.out.println("Enter a Insert Value");
        int p = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if (i < nd) {

                b[i] = a[i];

            } else if (i == nd) {

                b[i] = p;

            } else {

                b[i] = a[i - 1];
            }
        }

        for (int i = 0; i < a.length + 1; i++) {
            System.out.println(b[i]);
        }
    }

}