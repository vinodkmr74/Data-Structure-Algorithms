package Linked_list.Singly_list_list;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {

    Node head;

    // Add first element
    void AddFirst(int e) {

        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {

            newNode.next = head;
            head = newNode;
        }
    }

    // print for use

    void printLinkedList() {
        Node curr = this.head;

        while (curr != null) {
            System.out.println(curr.data);

            curr = curr.next;
        }
    }
}

public class Ad_First {

    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();

        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);

        ll.AddFirst(100);

        ll.AddFirst(2000);

        ll.printLinkedList();

    }

}
