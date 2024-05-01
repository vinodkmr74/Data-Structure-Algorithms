package Recursionss;

public class Five_to_one {

    public static void Fiveone(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Fiveone(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        Fiveone(n);
    }

}