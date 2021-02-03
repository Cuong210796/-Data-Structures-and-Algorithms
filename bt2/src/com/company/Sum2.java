package com.company;

public class Sum2 {
    public static int sum2(int[] a, int startIndex, int endIndex)
    {
        if (endIndex < 0)
            return 0;
        else if (endIndex == startIndex)
            return a[endIndex];
        return a[startIndex] + sum2(a, ++startIndex, endIndex);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum2(a,1,2));
    }
}
