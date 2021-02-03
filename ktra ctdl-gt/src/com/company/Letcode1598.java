package com.company;

import java.util.Stack;

public class Letcode1598 {
    static public int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++){
            if (count > 0 && logs[i].contains("../")){
                 count--;
            }else if (logs[i].contains("/") && !logs[i].contains("./")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"} ;
        System.out.println(minOperations(logs));
    }
}
