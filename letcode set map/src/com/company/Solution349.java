package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class Solution349 {
    static public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1){
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums2){
            if (set1.contains(i)){
                set2.add(i);
            }
        }
            int[] result = new int[set2.size()];
            int index = 0;
            for (int i : set2){
                result[index++] = i;
            }
            return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
