package Recursionss;

public class Natual_num {

    public static void natualnum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;

        }

        sum = sum + i;

        natualnum(i + 1, n, sum);
        System.out.println(i);

    }

    public static void main(String[] args) {
        natualnum(1, 10, 0);

    }

}
