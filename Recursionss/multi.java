package Recursionss;

public class multi {
    public static void printMulti(int num, int k) {
        if (k == 0) {
            return;

        }
        int mu = num * k;
        printMulti(num, k - 1);
        System.out.println(mu);
        return;
    }

    public static void main(String[] args) {
        int num = 12;
        int k = 5;
        printMulti(num, k);
    }

}