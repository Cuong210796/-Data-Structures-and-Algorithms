package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StackArray stack =  new StackArray(3);
        System.out.println("stack.isFull() " + stack.isFull());
        System.out.println("stack.isEmpty() " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("stack.isFull() " + stack.isFull());
        System.out.println("stack.isEmpty() " + stack.isEmpty());
        stack.print();

    }
}
