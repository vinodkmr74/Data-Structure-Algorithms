package ArrayList;

import java.util.ArrayList;

public class Revace {

    public static void main(String[] args) {
        ArrayList<Integer> rev = new ArrayList<>();

        rev.add(20);
        rev.add(100);
        rev.add(30);
        rev.add(50);
        rev.add(22);
        rev.add(10);

        System.out.println(rev);

        int i = 0, j = rev.size() - 1;
        while (i < j) {

            Integer temp = Integer.valueOf(rev.get(i));
            rev.set(i, rev.get(j));
            rev.set(j, temp);

            i++;
            j--;
        }
        System.out.print(rev);

    }

}
