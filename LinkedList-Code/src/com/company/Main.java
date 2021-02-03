package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList n1 = new LinkedList();
        n1.addAtHead(1);
        n1.printLinkedList();
        n1.addAtTail(2);
        n1.printLinkedList();
        n1.addAtHead(3);
        n1.printLinkedList();
        n1.removeAtTail();
        n1.printLinkedList();
    }
}
