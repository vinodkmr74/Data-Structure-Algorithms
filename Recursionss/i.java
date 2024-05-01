package Recursionss;

public class i {
    public static void printArm(int n) {
        int sum = 0;
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        n = n / 10;
        sum = (rem * rem * rem) + sum;
        System.out.println(sum);
        printArm(n);

    }

    public static void main(String args[]) {
        int n = 153;
        printArm(n);

    }

}
