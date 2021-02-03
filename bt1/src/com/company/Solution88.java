package com.company;

import java.util.Arrays;

public class Solution88 {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1;
        int n2 = n - 1;
        int t =  m + n - 1;
        while (n1 >= 0 || n2 >= 0) {
            if (n1 >= 0 && n2 >= 0){
                if (nums1[n1] >= nums2[n2]){
                    nums1[t] = nums1[n1];
                    n1--;
                    t--;
                }else {
                    nums1[t] = nums2[n2];
                    n2--;
                    t--;
                }
            }
            else if (n1 >= 0){
                nums1[t] = nums1[n1];
                n1--;
                t--;
            }
            else {
                nums1[t] = nums2[n2];
                n2--;
                t--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; int m =3;
        int[] nums2 = {2,5,6};       int n = 3;
        merge(nums1, m, nums2 , n);
//        for (int i=0; i < m + n; i++)
//        System.out.print(nums1[i]);
            System.out.print(Arrays.toString(nums1));
    }
}
