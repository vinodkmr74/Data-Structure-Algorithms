package Recursionss;

public class Test {

    public static int printfct(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        int fct = printfct(n - 1);
        n = n * fct;
        return n;

    }

    public static void main(String args[]) {
        int n = 5;
        int na = printfct(n);
        System.out.println(na);

    }

}
