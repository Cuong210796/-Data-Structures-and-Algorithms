package com.company;

public class Solution941 {
    static public boolean validMountainArray(int[] A) {
        boolean kq = false;
        for (int i = 0; i < A.length; i++){
            if (A.length >= 3 && A[0] < A[i] && A[i] > A[A.length - 1])
                kq = true;
        }
        return kq;
    }

    public static void main(String[] args) {
        int[] A = {0,3,2,1};
        System.out.println(validMountainArray(A));
    }
}
