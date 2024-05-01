package Selection_Sort;

public class Selection_two {
    public static void main(String[] args) {

        int arr[] = { 6, 8, 1, 4, 7, 9 };
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minindex]) {

                    minindex = j;
                }
            }

            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

}
