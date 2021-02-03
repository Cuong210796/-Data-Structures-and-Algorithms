package com.company;

public class LinkedList {
    private Node head;
    LinkedList(){
        head = null;
    }
    public void addAtTail(int data){
        Node newNode = new Node(data, null);
        if (head == null){
            // Linked List rỗng
            head = newNode;
        }else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void addAtHead(int data){
        Node newNode = new Node(data, null);
        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeAtTail(){
        Node prev = null;
        Node last = head;

        while (last != null){
            if (last.next == null){
                if (prev == null){ // last là phần tử duy nhất
                 last = null;
                }else {
                    prev.next = null;
                }
                break;
            }
            prev = last;
            last = last.next;
        }
    }

    public void removeAtHead(){
        
    }

    public void printLinkedList(){
        if (head == null){
            System.out.println("List is empty !");
        }else{
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
                if (temp != null){
                    System.out.println("->");
                }else
                    System.out.println();
            }
        }
    }
}
