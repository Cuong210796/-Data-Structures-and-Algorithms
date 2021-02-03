package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> preOrderTravel(TreeNode curNode)
    {
        List<Integer> result = new ArrayList<>();
        preOrderTravel(curNode, result);
        return result;
    }

    public static List<Integer> preOrderTravel(TreeNode curNode, List<Integer> result)
    {
        if(curNode == null){
            return result;
        }

        // Đổi vị trí 3 dòng tiếp theo để thay đổi quy luật của cách chạy preOrder(Node-L-R) hay inOrder(L_Node-R) hay postOrder(L-R-Node)
        result.add(curNode.val);
        preOrderTravel(curNode.left, result);
        preOrderTravel(curNode.right, result);
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);

        n4.left = n2;
        n4.right = n6;

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;

        System.out.println("Cay n4");
        List<Integer> resultPreOrder = preOrderTravel(n4);
        for (Integer integer : resultPreOrder) {
            System.out.println(integer);
        }

        System.out.println("Cay n2");
        resultPreOrder = preOrderTravel(n2);
        for (Integer integer : resultPreOrder) {
            System.out.println(integer);
        }
    }
}
