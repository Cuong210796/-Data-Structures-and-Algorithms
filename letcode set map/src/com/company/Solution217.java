package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> myset = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (myset.contains(nums[i]) == false){
                myset.add(nums[i]);
            }else {
                return true;
            }
        }
        return false;

//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if(map.containsKey(nums[i]) == false){
//                map.put(nums[i], 1);
//            }else{
//                int newValue = map.get(nums[i]) + 1;
//                map.put(nums[i], newValue);
//            }
//        }
//
//        for (Map.Entry e : map.entrySet()) {
//            System.out.println("key = " + e.getKey() + " value " + e.getValue());
//        }
//
//
//
//        return false;
//    }

    }

    public static void main(String[] args) {

    }
}
