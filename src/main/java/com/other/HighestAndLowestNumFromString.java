package com.other;

public class HighestAndLowestNumFromString {
    public static void main(String[] args) {
        System.out.println( highAndLow("3 5 7 8 9 1"));
    }


  static String highAndLow(String str) {
        String[] strings = str.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String s : strings) {
            int num = Integer.parseInt(s);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return ""+max + " " + min; }


    }
