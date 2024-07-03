package Linked_list.Singly_list_list;

class Mide_Add {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void add(int e) {
        Node newNode = new Node(e);

        if (head == null) {

            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void Mideadd(int index, int element) {
        if (index == 0) {
            add(element);

        } else {
            Node temp = new Node(element);
            int count = 0;
            Node curr = head;
            while (count < index - 1) {
                curr = curr.next;
                count++;

            }
            temp.next = curr.next;
            curr.next = temp;

        }

    }

    void printff() {
        Node curr = this.head;

        while (curr != null) {
            System.out.println(curr.data);

            curr = curr.next;

        }

    }

    public static void main(String aggs[]) {

        Mide_Add mm = new Mide_Add();
        mm.add(10);// 3
        mm.add(20);// 2
        mm.add(40);// 1
        mm.add(50);// 0

        mm.Mideadd(2, 30);

        mm.printff();

    }

}