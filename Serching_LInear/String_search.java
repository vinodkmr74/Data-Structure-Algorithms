package Serching_LInear;

public class String_search {

    public static void main(String args[])

    {

        String serch = "abc";
        int temp = 0;

        String arr[] = { "vinod", "Deepak", "Avinash", "abc" };
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == serch) {

                System.out.println("string Search: " + arr[i]);

                temp = temp + 1;

            }
        }
        if (temp == 0) {
            System.out.println("not String");
        }

    }
}