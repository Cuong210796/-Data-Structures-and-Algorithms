package com.company;

public class QueueArray implements IStackQueue {
    private int[] arr;
    private int headIndex;
    private int tailIndex;
    private int SIZE;

    QueueArray(int size){
        this.SIZE = size;
        arr = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public void push(int value) {
        if (!isFull()){
            if (isEmpty()){
                headIndex++;
            }
                tailIndex++;
                arr[tailIndex] = value;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()){
            return -1;
        }
        int result = arr[headIndex++];
        if (headIndex > tailIndex){
            headIndex = tailIndex = -1;
        }
        return result;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex ==  - 1) && (tailIndex ==  - 1);
    }
}
