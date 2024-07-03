package Linked_list.Singly_list_list;

class Node {
int data;
Node next;

Node(int data) {
this.data = data;
this.next = null;
}

}

class TreavelList {
Node head;

void LinkedlistPrint() {

Node curr = head;

while (curr != null) {
System.out.println(curr.data);

curr = curr.next;

}

}
}

class Treavel_Node {

public static void main(String[] args) {

TreavelList tl = new TreavelList();

// Node object
Node p1 = new Node(10);
Node p2 = new Node(20);
Node p3 = new Node(30);
Node p4 = new Node(40);

// connected Node
p1.next = p2;
p2.next = p3;
p3.next = p4;
tl.head = p1;

tl.LinkedlistPrint();

}

}
