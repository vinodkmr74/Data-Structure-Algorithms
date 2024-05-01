package Recursionss;

public class Array_Max_recursion {

    public static int printMax(int arr[], int index) {
        if (index == arr.length - 1) { // base case
            return arr[index];
        }
        int max = printMax(arr, index + 1); // Recursion call
        return Math.max(arr[index], max); // compare

    }

    public static void main(String[] args) {
        int arr[] = { 3, 10, 3, 2, 5 };
        int index = 0;
        int max = printMax(arr, index);
        System.out.println("max: " + max);

    }
}
