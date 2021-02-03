package com.company;

public class Solution283 {
    static public void moveZeroes(int[] nums) {

        int i = 0;

        for (int j =0 ; j < nums.length ; j++){
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (; i < nums.length ; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int j=0 ; j<nums.length; j++)
            System.out.println(nums[j]);
    }
}
