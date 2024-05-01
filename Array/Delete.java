package Array;

import java.util.Scanner;

public class Delete {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n - 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter indexx valuse");
        int index = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (i < index) {
                b[i] = a[i];

            } else if (i == index) {
                continue;

            } else {

                b[i - 1] = a[i];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println(b[i]);
        }

    }

}
