package com.leetcode;

public class A_58_Length_Of_Last_Word {

    public static int lengthOfLastWord(String s) {
        if(!s.contains(" "))return 1;
        int p = s.length() - 1;
        while (p >=0 && s.charAt(p) ==' ') {
            p--;
        }
        int length = 0;
        while (p>=0 && s.charAt(p)!=' ') {
            p--;
            length++;
        }
        return length;
    }
}
