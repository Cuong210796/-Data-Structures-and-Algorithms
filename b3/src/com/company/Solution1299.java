package com.company;

import java.util.Arrays;

public class Solution1299 {
    static public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != arr.length)
               arr[i] = Math.max(arr[i], arr[i+1]);
        }
        for (int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        if (arr.length > 0){
            arr[arr.length - 1] = - 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
