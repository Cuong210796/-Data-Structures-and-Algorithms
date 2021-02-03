package com.company;

public class Letcode724 {
    static public int pivotIndex(int[] nums) {

        if(nums.length<1)
            return -1;
        int right=0, left=0;
        for(int x:nums)
            right+=x;
        for(int x=0; x<nums.length; x++)
        {
            right-=nums[x];
            if(right==left)
                return x;
            left+=nums[x];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(pivotIndex(nums));
    }
}
