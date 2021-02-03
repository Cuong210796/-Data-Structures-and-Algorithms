package com.company;

import java.util.*;

public class Main {

    public static void BFS(TreeNode root){ // Duyệt theo thứ tự
        Queue<TreeNode> queue = new LinkedList<>(); // Tạo bằng link list
        Set<TreeNode> set = new HashSet<>(); // nút đã duyệt

        // b1. Add root vao queue
        queue.add(root);
        set.add(root);

        while (queue.isEmpty() == false){
            TreeNode curNode = queue.poll();
            System.out.print(curNode.val + " ");
            if (curNode.left != null && set.contains(curNode.left) == false){ // điều kiện left chưa tồn tại và phần tử add k thuộc đã duyêt
                queue.add(curNode.left);
                set.add(curNode.left);
            }
            if (curNode.right != null && set.contains(curNode.right) == false){
                queue.add(curNode.right);
                set.add(curNode.right);
            }
        }
    }

    public static void preOrderTravel(TreeNode curNode)
    {
        if(curNode == null){
            return ;
        }

        // cong thuc
        System.out.print(curNode.val + " ");
        preOrderTravel(curNode.left);
        preOrderTravel(curNode.right);
    }

    public static void DFS(TreeNode root){ // Không duyệt theo thứ tự
        Stack<TreeNode> stack = new Stack<>(); // Tạo bằng link list
        Set<TreeNode> set = new HashSet<>(); // nút đã duyệt

        // b1. Add root vao queue
        stack.add(root);
        set.add(root);

        while (stack.isEmpty() == false){
            TreeNode curNode = stack.pop();
            System.out.print(curNode.val + " ");
            if (curNode.right != null && set.contains(curNode.right) == false){
                stack.add(curNode.right);
                set.add(curNode.right);
            }
            if (curNode.left != null && set.contains(curNode.left) == false){ // điều kiện left chưa tồn tại và phần tử add k thuộc đã duyêt
                stack.add(curNode.left);
                set.add(curNode.left);
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.left = n2;
        n1.right = n4;
        n2.left = n3;
        n2.right = n5;
        n4.right = n6;
        System.out.println("BFS: ");
        BFS(n1);
        System.out.println("\n" + "DFS: ");
        DFS(n1);
        System.out.print("\n" + "preOrder: \n");
        preOrderTravel(n1);
    }
}
