package Count_sort;

public class Given_number {

    public static int maxArr(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;

    }

    public static void printCount(int arr[], int n) {
        int mx = maxArr(arr, n);

        int count[] = new int[mx + 1];
        for (int i = 0; i < n; i++) {

            count[arr[i]]++;

        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;

            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3, 4, 5, 6, 2, 1, 3, 4, };

        int n = arr.length;

        int max = maxArr(arr, n);
        System.out.println("max: " + max);
        printCount(arr, n);
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
