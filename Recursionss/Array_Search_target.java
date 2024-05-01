package Recursionss;

public class Array_Search_target {

    public static boolean printSearch(int arr[], int index, int x) {

        if (index == arr.length)
            return false;

        if (arr[index] == x)
            return true;

        return printSearch(arr, index + 1, x);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 12, 54, 14, 3, 8, 6, 1 };
        int index = 0;
        int x = 85;

        if (printSearch(arr, index, x)) {
            System.out.println("yes: " + x);
        } else {
            System.out.println("not: " + x);
        }

    }
}
