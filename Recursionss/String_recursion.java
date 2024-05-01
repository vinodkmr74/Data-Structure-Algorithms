package Recursionss;

public class String_recursion {
    public static void printStr(String str, int index) {
        if (index == str.length()) {
            return;
        }
        System.out.print(str.charAt(index));
        printStr(str, index + 1);
    }

    public static void main(String[] args) {
        String str = "vinod";
        int index = 0;
        printStr(str, index);
    }
}
