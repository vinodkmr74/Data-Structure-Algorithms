public class Teest {

    public static void printArr(int a[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 3 };

        int n = a.length - 1;
        printArr(a, n);
    }

}
