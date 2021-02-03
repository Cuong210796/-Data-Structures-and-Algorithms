package com.company;

public class Letcode1512 {
    static public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,1,2};
        System.out.println(numIdenticalPairs(nums));
    }
}
