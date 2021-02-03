package com.company;

import java.util.Stack;

public class UseStackQueue {
    public static void main(String[] args) {
        // Queue<Integer> myQueue = new LinkedList<>();

        // System.out.println("myQueue.isEmpty(): " + myQueue.isEmpty());
        // System.out.println("myQueue.add(9): " + myQueue.add(9));
        // System.out.println("myQueue.add(10): " + myQueue.add(10));
        // System.out.println("myQueue.isEmpty(): " + myQueue.isEmpty());
        // System.out.println("myQueue.size(): " + myQueue.size());
        // System.out.println("myQueue.poll(): " + myQueue.poll());
        // System.out.println("myQueue.size(): " + myQueue.size());
        // System.out.println("myQueue.peek(): " + myQueue.peek());
        // System.out.println("myQueue.size(): " + myQueue.size());


        Stack<Integer> myStack = new Stack<>();
        myStack.push(100);
        System.out.println("myStack.peek(): " + myStack.peek());
        System.out.println("myStack.size(): " + myStack.size());
        System.out.println("myStack.pop(): " + myStack.pop());
        System.out.println("myStack.size(): " + myStack.size());
    }
}
