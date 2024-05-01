package Recursionss;

import java.util.Scanner;

public class string_palindrom {

    public static boolean Palindrome(String str, int index, int end) {
        if (index == str.length()) {
            return true;
        }
        if (str.charAt(index) != str.charAt(end)) {
            return false;
        }
        return Palindrome(str, index + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int index = 0;
        if (Palindrome(str, index, str.length() - 1)) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
    }
}