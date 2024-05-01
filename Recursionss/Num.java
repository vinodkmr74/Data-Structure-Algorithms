package Recursionss;

public class Num {
    public static void printOne(int n, String str[], int index) {
        if (n == 0) {
            return;
        }
        int rev = n % 10;
        n = n / 10;
        System.out.println(rev + "  " + str[index]);

        printOne(n, str, index - 1);

    }

    public static void main(String[] args) {
        int n = 432;
        String str[] = { "four", "three", "two" };
        printOne(n, str, str.length - 1);
    }

}