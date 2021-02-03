package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode844 {
    static public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '#'){
                stack.pop();
            }
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == T.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "a#c";
        String T = "b";
        System.out.println(backspaceCompare(S,T));
    }
}
