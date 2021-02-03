package com.company;

class Solution485 {
    static public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ketqua = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == 0){
                count = 0 ;
            }
            else {
                count++;
                ketqua = Math.max(count, ketqua);
            }
        }
        return ketqua;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        int kq = findMaxConsecutiveOnes(nums);
        System.out.println(kq);
    }
}
