package Linked_list.Duble_Linked_list;

//public class One {

class Node {
    int data;
    Node pre;
    Node next;

    Node(int data) {

        this.data = data;
        this.pre = null;
        this.next = null;

    }
}

class DoubliLinkList {
    Node head;
    Node Tail;
}

public class One {

    public static void main(String args[]) {

        Node temp = new Node(10);
        System.out.println(temp.data);
        System.out.println(temp.pre);
        System.out.println(temp.next);

    }
}