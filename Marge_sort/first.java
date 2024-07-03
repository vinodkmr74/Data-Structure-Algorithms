package Marge_sort;

public class first {

    public static void merge(int arr[], int s, int e) {
        int mid = (s + e) / 2;
        int len1 = mid - s + 1;
        int len2 = e - mid;

        // first array
        int firstarr[] = new int[len1];

        // secand array
        int secandarr[] = new int[len2];

        // copy values
        int k = s;
        for (int i = 0; i < len1; i++) {
            firstarr[i] = arr[k++];
        }
        k = mid + 1;
        for (int i = 0; i < len2; i++) {
            secandarr[i] = arr[k++];
        }

        // secandarr 2 merge
        int index1 = 0;
        int index2 = 0;
        k = s;

        while (index1 < len1 && index2 < len2) {

            if (firstarr[index1] < secandarr[index2]) {
                arr[k++] = firstarr[index1++];

            } else {
                arr[k++] = secandarr[index2++];

            }
        }
        while (index1 < len1) {
            arr[k++] = firstarr[index1++];
        }
        while (index2 < len2) {
            arr[k++] = secandarr[index2++];

        }

    }

    public static void Dived(int arr[], int s, int e) {

        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        // left part sort
        Dived(arr, s, mid);

        // right part sort
        Dived(arr, mid + 1, e);

        // merge
        merge(arr, s, e);

    }

    public static void main(String args[]) {
        int arr[] = { 22, 9, 10, 6, 8 };
        int n = arr.length;
        int s = 0; // stating index=0;
        int e = n - 1; // ending index=n-1;
        Dived(arr, s, e);

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }

    }

}