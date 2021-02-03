package com.company;

public class Letcode205 {
    static public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()){
            return false;
        }
        int[] a1 = new int[1000];
        int[] a2 = new int[1000];
        for (int i = 0; i < s.length(); i++) {
            char b1 = s.charAt(i);
            char b2 = t.charAt(i);
            if (a1[b1] != a2[b2]){
                return false;
            }
            a1[b1] = i + 1;
            a2[b2] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));
    }
}
