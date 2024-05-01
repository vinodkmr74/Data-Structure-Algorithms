package Recursionss;

import java.util.Scanner;

public class string_Revarce {

    public static String printRev(String str, int index) {
        if (index == str.length()) {
            return " ";

        }
        String rev = printRev(str, index + 1);
        return rev + str.charAt(index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int index = 0;
        System.out.println(printRev(str, index));
    }
}