package com.leetcode;

import java.util.LinkedList;

public class A_32_Longest_Valid_Parentheses {

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("()()"));

    }

    public static int longestValidParentheses(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty()) // catches the index of the last invalid sign
                    stack.push(i);
                else // there is a valid series
                    result = Math.max(result, i - stack.peek());
            }
        }
        return result;
    }
}