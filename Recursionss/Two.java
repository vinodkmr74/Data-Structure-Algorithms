package Recursionss;

public class Two {

    public static void printTwo(int n) {
        if (n == 1) {

            return;
        }

        System.out.println("two");
        printTwo(n - 1);

    }

    public static void main(String[] args) {
        int n = 2;
        printTwo(n);

    }

}