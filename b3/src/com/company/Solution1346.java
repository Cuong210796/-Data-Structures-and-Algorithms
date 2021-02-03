package com.company;

public class Solution1346 {
    static public boolean checkIfExist(int[] arr) {
        boolean kq = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 2*arr[j] || arr[j] == 2*arr[i])
                 kq = true;
            }
        }
        return kq;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
}
