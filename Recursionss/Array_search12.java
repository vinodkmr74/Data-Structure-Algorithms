package Recursionss;

public class Array_search12 {

    public static int printSearch(int arr[], int index, int x) {

        if (index == arr.length)
            return 0;

        if (arr[index] == x) {
            System.out.println(index);
        }

        return printSearch(arr, index + 1, x);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 5 };
        int index = 0;
        int x = 2;

        printSearch(arr, index, x);

    }
}
