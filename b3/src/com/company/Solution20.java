package com.company;

import java.util.Arrays;
import java.util.Stack;

//letcode 20
public class Solution20 {

    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0){
            return false;
        }
        else {
            for (char c : s.toCharArray()) {
                if (c == '{' || c == '[' || c == '(') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {   //ktra rỗng và so sánh
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([}}])";
        System.out.println(isValid(s));
    }
}
