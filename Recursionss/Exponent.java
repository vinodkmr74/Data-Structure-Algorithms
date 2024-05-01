package Recursionss;

public class Exponent {

    public static int expoPower(int n) {
        if (n == 0) {
            return 1;

        }

        int ans = 2 * (2 * n);
        expoPower(n - 1);
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int ans = expoPower(n);
        System.out.println("ans: " + ans);

    }
}
