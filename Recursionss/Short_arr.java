package Recursionss;

public class Short_arr {
    public static boolean printShort(int arr[], int index) {
        if (index >= arr.length) {
            return true;

        }

        if (arr[index] < arr[index - 1]) {
            return false;
        }
        return printShort(arr, index);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int index = 0;
        System.out.println(printShort(arr, index));

    }
}