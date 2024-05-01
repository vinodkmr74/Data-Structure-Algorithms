package Recursionss;

public class Count_vowel_consonent {

    public static int printVC(String str, int index, int count[]) {
        if (index == str.length()) {
            return 0;
        }
        char currentchar = str.charAt(index);

        if (currentchar == 'a' || currentchar == 'e' || currentchar == 'i' || currentchar == 'o'
                || currentchar == 'u') {
            count[0]++;

        } else if (currentchar >= 'a' && currentchar <= 'z') {
            count[1]++;
        }

        return printVC(str, index + 1, count);

    }

    public static void main(String args[]) {
        String str = "hello world";
        int count[] = new int[2];
        printVC(str, 0, count);
        System.out.println("vowel: " + count[0]);
        System.out.println("consonent: " + count[1]);

    }

}
