package com.leetcode;

public class A_171_Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        System.out.println(  titleToNumber("AAA")  );
    }


    public static int titleToNumber(String columnTitle) {

        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.toUpperCase().charAt(i) - 64);
        }
        return result;
    }

}