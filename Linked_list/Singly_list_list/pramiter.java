package Linked_list.Singly_list_list;

public class pramiter {

    int x, y, z;

    pramiter(int a, int b) { /// pramiter

        x = a;
        y = b;
        z = a + b;
    }

    void show() {

        System.out.println(x + "" + y + "" + z);

    }

    public static void main(String[] args) {

        pramiter w = new pramiter(2, 3);
         w.show();
    }

}
