package Recursionss;

public class Serise {

    public static int printSerise(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0)

        {
            // odd case
            return printSerise(n - 1) - n;
        } else {
            // even case
            return printSerise(n - 1) + n;
        }
    }

    public static void main(String args[]) {
        int n = 10;
        int ans = printSerise(n);
        System.out.println(ans);

    }

}