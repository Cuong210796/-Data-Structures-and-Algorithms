package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution136 {
    static public int singleNumber(int[] nums) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++){
//            result ^= nums[i];
//        }
//        return result;
        HashMap<Integer, Integer> f = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!f.containsKey(nums[i])){
                f.put(nums[i],1);
            }else {
                f.put(nums[i], f.get(nums[i] + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : f.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
