package Selection_Sort;

public class selection_first {

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            int smollindex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smollindex] > arr[j]) {
                    smollindex = j;
                }
            }

            int temp = arr[smollindex];
            arr[smollindex] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

    }
}