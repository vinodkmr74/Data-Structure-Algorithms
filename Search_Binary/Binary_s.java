package Search_Binary;

public class Binary_s {

    public static int binaryArr(int arr[], int n, int search) {

        int s = 0;
        int e = n - 1;
        int mid = (s + e) / 2;

        while (s <= e) {

            if (arr[mid] == search) {

                return mid;
            }

            else if (search > arr[mid]) {
                s = mid + 1;
            } else {

                e = mid - 1;
            }
        }

        mid = (s + e) / 2;

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 9, 13, 27 };

        int n = arr.length;
        int search = 5;
        System.out.println(binaryArr(arr, n, search));
    }

}
