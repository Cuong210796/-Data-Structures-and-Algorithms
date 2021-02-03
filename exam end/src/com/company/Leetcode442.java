package com.company;

import java.util.LinkedList;
import java.util.List;

public class Leetcode442 {
    static public List<Integer> findDuplicates(int[] nums) {
        List<Integer> count = new LinkedList<>();
        for(int i = 0 ; i< nums.length ; i++){
                int kq = Math.abs(nums[i]) - 1;
                if (nums[kq] < 0){
                    count.add(kq+1);
                }
                nums[kq] = -nums[kq];
            }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
