package Recursionss;

public class Array_sumu {

    public static int printsum(int arr[], int index) {
        if (index == arr.length) { // base case
            return 0;
        }
        int sum = printsum(arr, index + 1); // Recursion call
        return sum + arr[index];

    }

    public static void main(String[] args) {
        int arr[] = { 3, 10, 3, 2, 5 };
        int index = 0;
        int sum = printsum(arr, index);
        System.out.println("sum: " + sum);

    }
}
