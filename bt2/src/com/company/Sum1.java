package com.company;

public class Sum1 {
    public static int sum1(int[] a, int i) {
        if (i < 0)
            return 0;
        else if (i == a.length - 1)
            return a[a.length - 1];
        return a[i] + sum1(a, ++i); // tổng của i và tất cả các số từ 0 đến i - 1
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0;
        System.out.println(sum1(a, i));
    }
}
