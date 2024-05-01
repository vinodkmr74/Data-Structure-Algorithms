package Recursionss;

public class Gcd {

    public static int printGcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;     //equel
            y = rem;   //equel
        }
        return y;

    }

    public static void main(String args[]) {
        int x = 24;
        int y = 15;
        int ans = printGcd(x, y);
        System.out.println(ans);
    }

}
