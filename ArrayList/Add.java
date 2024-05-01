package ArrayList;

import java.util.ArrayList;

public class Add {

    public static void main(String[] args) {

        ArrayList<Integer> ad = new ArrayList<>();
        ad.add(10);
        ad.add(12);
        ad.add(30);
        ad.add(40);
        System.out.println(ad);

        // one element get
        System.out.println(ad.get(1));

        // all data get and size
        for (int i = 0; i < ad.size(); i++) {
            System.out.println(ad.get(i));
        }

    }

}
