package Recursionss;

/**
 * Power
 */
public class Power {

    public static int powerx(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        int px = powerx(x, n - 1);
        int po = x * px;
        return po;

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = powerx(x, n);
        System.out.println(ans);

    }
}