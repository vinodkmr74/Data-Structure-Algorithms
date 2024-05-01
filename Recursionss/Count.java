package Recursionss;

public class Count {

    public static int printCount(int n) {
        if (n == 0) {
            return 0;
        }

        // int rew = n % 10;
        n = n / 10;
        int ans = (1 + printCount(n));
        printCount(n);
        return ans;

    }

    public static void main(String args[]) {
        int n = 87;
        int ans = printCount(n);
        System.out.println(ans);

    }
}
