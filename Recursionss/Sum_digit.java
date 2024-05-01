package Recursionss;

public class Sum_digit {
    public static int printSum(int n) {
        if (n == 0) {
            return 0;
        }
        int rew = n % 10;
        n = n / 10;
        int ans = (rew + printSum(n));
        printSum(n);
        return ans;

    }

    public static void main(String args[]) {
        int n = 12345;
        int ans = printSum(n);
        System.out.println(ans);

    }
}