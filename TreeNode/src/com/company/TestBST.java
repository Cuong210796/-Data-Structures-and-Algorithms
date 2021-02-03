package com.company;

public class TestBST {
    public static void main(String[] args) {
        MyBinarySearchTree mytree = new MyBinarySearchTree();
        mytree.add(4);
        mytree.add(2);
        mytree.add(6);
        mytree.add(1);
        mytree.add(3);
        mytree.add(5);
        mytree.add(7);

        mytree.print();

    }
}
