package Linked_list.Duble_Linked_list;

class Dll_Add {

    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void displayAll(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();

    }

    public static void main(String args[]) {

        Node a = new Node(50);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;

        displayAll(a);

    }
}