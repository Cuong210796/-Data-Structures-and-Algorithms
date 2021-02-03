package com.company;

import java.util.Scanner;

public class Solution70 {
    static int[] F = new int [1000];
    static public int climbStairs(int n) {
        if (F[n] != 0)
            return F[n];
        if (n <= 2)
            return n;
        F[n] = climbStairs(n-1) + climbStairs(n-2);
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println("Nhap so bac thang:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("So cach len bac thang:" + "\n" + climbStairs(x));
    }
}
