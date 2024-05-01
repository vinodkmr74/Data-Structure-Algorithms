package Recursionss;

public class T_even {
    public static void printEven(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 0) {
        
            printEven(n - 1);
            System.out.println(n);

        } else {
            printEven(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        printEven(n);
    }

}
