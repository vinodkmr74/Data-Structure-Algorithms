package Quick_sort;

public class A {

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int cut = 0;
        for (int i = s + 1; i < e; i++) {
            if (arr[i] <= pivot) {
                cut++;
            }
        }
        // place pivot at right position

        int pivotindex = s + cut;
        int temp = arr[pivotindex];
        arr[pivotindex] = arr[s];
        arr[s] = temp;

        // left and right part
        int i = s, j = e;

        while (i < pivotindex && j > pivotindex) {

            while (arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotindex && j > pivotindex) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return pivotindex;
    }

    public static void Quick(int arr[], int s, int e) {
        // base case
        if (s >= e) {
            return;
        }
        // partition
        int p = partition(arr, s, e);
        // left part sort
        Quick(arr, s, p - 1);
        // right part sort
        Quick(arr, p + 1, e);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 9, 4, 7, 5, 3, 10 };
        int n = arr.length - 1;
        int s = 0;
        int e = n - 1; // Corrected initialization of e
        Quick(arr, s, e);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}