package Recursionss;

public class Print_n {
    public static void onetofive(int n) {
        if (n == 10) {
            return;
        }
        System.out.println(n);
        onetofive(n + 1);
    }

    public static void main(String args[]) {
        int n = 1;
        onetofive(n);
    }

}
