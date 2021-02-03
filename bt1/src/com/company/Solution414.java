package com.company;

public class Solution414 {
    static public int thirdMax(int[] nums) {
        // nếu n < 3 thì trả về giá trị max
        // nếu n > 3 thì trả về giá trị lớn thứ 3
        int n = nums.length;
//        int max = nums[0];
        int max1 = 0;
        for (int i = 0; i < n; i++){
                if (i == 0){
                    max1 = nums[0];
                }
                else if (nums[i] > max1){
                    max1 = nums[i];
                }
            if (n < 3){
                return max1;
            }
        }
        int max2 = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] > max2 && nums[i] < max1){
                max2 = nums[i];
            }
        }
        int max3 = nums[1];
        for (int i = 0; i < n; i++) {
            if (nums[i] > max3 && nums[i] < max2){
                max3 = nums[i];
            }
        }
    return  max1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(thirdMax(nums));
    }
}
