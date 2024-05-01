package Recursionss;

public class Factorial {

    public static int printfact(int n) {
        if (n == 1) {

            return 1;

        }
        int fac = printfact(n - 1);
        n = n * fac;
        return n;
    }

    public static void main(String[] args) {

        int n = 5;
        int a = printfact(n);
        System.out.println(a);

    }

}
