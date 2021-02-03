package com.company;

public class Solution1051 {
//    public static void printArray(int[] a){
//        System.out.println("Array: ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//    }

    static public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copied = new  int[n];

        for (int i = 0; i < n; i++) {
            copied[i] = heights[i];
        }
//        printArray(copied);
        
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if (copied[j] < copied[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int t = copied[i];
                copied[i] = copied[minIndex];
                copied[minIndex] = t;
            }
        }
//        printArray(copied);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != copied[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
