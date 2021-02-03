package com.company;

public class SimpleRecursion {
    public static int find(int x, int[] a, int i) {
        int n = a.length;
        if (i >= n)
            return -1;
        else if (a[i] == x)
            return i;
        return find(x,a,i + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0;
        System.out.println(find(2,a,i));
    }
}
