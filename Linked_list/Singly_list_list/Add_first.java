package Linked_list.Singly_list_list;

class Add_first {

    Node head; // Node criate

    class Node { // node class bnana h

        int data;
        Node next; // pointer next address

        Node(int data) { // node ke constecture bnega;
            this.data = data;
            this.next = null;
        }
    }

    public void addf(int data) {
        Node newNode = new Node(data); // node criate kiya h
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void lastF(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        // treval node

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String args[]) {

        Add_first list = new Add_first();

        list.addf(2);
        list.lastF(45);
        list.printList();
        list.addf(50);
        list.printList();

    }

}
