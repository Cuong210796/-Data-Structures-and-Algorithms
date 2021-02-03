package com.company;

import java.util.HashSet;
import java.util.Stack;

public class Leetcode929 {
    static public int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();
        for (String str:emails) {
            String s1 = str.substring(0, str.indexOf('@'));
            String s2 = str.substring(str.indexOf("@"), str.length());
            if (s1.contains(".")){
                s1 = s1.replace(".","");
            }
            if (s1.contains("+")){
                s1 = s1.substring(0,s1.indexOf("+"));
            }
           hashSet.add(s1+s2);
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
