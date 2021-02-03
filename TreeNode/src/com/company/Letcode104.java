package com.company;


public class Letcode104 {
    static public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }else {
            int maxLeftDepth = 1 + maxDepth(root.left);
            int maxRightDepth = 1 + maxDepth(root.right);
            return Math.max(maxLeftDepth, maxRightDepth);
        }
    }

    public static void main(String[] args) {
        
    }
}
