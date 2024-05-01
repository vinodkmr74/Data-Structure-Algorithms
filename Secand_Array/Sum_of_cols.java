package Secand_Array;

public class Sum_of_cols {
    public static void main(String args[]) {

        System.out.println("Enter cols element");
        int cols[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cols[i][j] + " ");

            }
            System.out.println(" ");

        }
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += cols[j][i];

            }
            System.out.println("sum of cols" + i + 1 + "is: " + sum);
        }

    }

}
