package Serching_LInear;

public class Search {

    public static void main(String[] args) {

        int Search = 40;
        int temp = 0;
        int arr[] = { 2, 8, 6, 5, 7, 9 };

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == Search) {
                System.out.println("Search: " + arr[i]);  //valuse print

                // not ableble element;
                temp = temp + 1;
            }

        }
        if (temp == 0) {
            System.out.println("not found Element");
        }

    }

}
