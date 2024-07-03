package Linked_list.Singly_list_list;

class Last {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // class Linkedlist {

    // Node head;

    // Method to add a node at the end of the list
    void addLast(int d) {
        Node tempNode = new Node(d);
        if (head == null) {
            head = tempNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = tempNode;
        }
    }

    // Method to print the linked list
    void printLinked() {
        Node curr = this.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    // }

    // public class Last {
    public static void main(String[] args) {
        Last ll = new Last();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(300);

        ll.printLinked();
    }
}
