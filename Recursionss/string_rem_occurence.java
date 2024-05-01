package Recursionss;

import java.util.Scanner;

public class string_rem_occurence {

    public static String printRem(String str, int index) {
        if (index == str.length()) {
            return " ";
        }

        // Recursion call
        String smallp = printRem(str, index + 1);

        char currchar = str.charAt(index);

        // self work

        if (currchar != 'a') {
            return currchar + smallp;
        } else {
            return smallp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int index = 0;
        System.out.println(printRem(str, index));

    }

}
