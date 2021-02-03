package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
                map.put(nums[i], i);
            }
        int[] result = new int[2];
        for (int i = 0; i <nums.length; i++){
            int k = target - nums[i];
            if (map.containsKey(k) == true){
                int kIndex = map.get(k);
                if(kIndex != i)
                {
                    result[0] = i;
                    result[1] = kIndex;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {3,2,4};
        twoSum(a,6);
    }
}
