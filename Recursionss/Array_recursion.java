package Recursionss;

import java.util.*;

public class Array_recursion {
    public static void printArray(int arr[], int index) {

        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]); // 5
        printArray(arr, index + 1); // 4,2,3,15
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 2, 3, 15 };
        int index = 0;
        printArray(arr, index);
    }

}