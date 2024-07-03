package Quick_sort;

public class Q_sort {

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int cut = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                cut++;
            }
        }
        // place pivot at right position

        int pivotindex = s + cut;
        int temp = arr[s];
        arr[s] = arr[pivotindex];
        arr[pivotindex] = temp;
        // sawp(arr, s, pivotindex);

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
                // swap(arr, i, j);
            }
        }

        return pivotindex;

    }

    public static void Quick(int arr[], int s, int e) {
        // bese case
        if (s >= e) {
            return;
        }
        // patition karenge

        int p = partition(arr, s, e);

        // left part sort karo
        Quick(arr, s, p - 1);

        // right part sort karo
        Quick(arr, p + 1, e);

    }

    public static void main(String args[]) {
        int arr[] = { 4, 8, 6, 1, 5, 7 };
        int n = arr.length;
        int s = 0;
        int e = s - 1;
        Quick(arr, s, e);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}