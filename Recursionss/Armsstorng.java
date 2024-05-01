package Recursionss;

public class Armsstorng {
    // Declare sum outside the method to accumulate across recursive calls
    static int sum = 0;

    public static void printArm(int n) {
        int temp = n;
        if (n == 0) {
            // Print the final sum only when the recursion reaches the base case
            System.out.println(sum);

            return;
        }

        int rem = n % 10;
        n = n / 10;
        sum = (rem * rem * rem) + sum;
        printArm(n); // Recursively call printArm with the updated value of n

        if (sum == temp) {
            System.out.println("Armstorng");
        }
        // } else {
        // System.out.println("not Armstorng");
        // }
    }

    public static void main(String args[]) {
        int n = 371;
        printArm(n);
    }
}
