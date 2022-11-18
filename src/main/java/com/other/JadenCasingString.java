package com.other;

public class JadenCasingString {
    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(toJadenCase2("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        String result = "";
        String[] strings = phrase.split(" ");
        for (String str : strings) {
            result += (str.charAt(0) + "").toUpperCase() + str.substring(1) + " ";
        }
        return result.trim();
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        char[] array = phrase.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == ' ') {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }
}
