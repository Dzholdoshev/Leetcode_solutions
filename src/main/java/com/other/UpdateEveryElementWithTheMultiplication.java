package com.other;

import java.util.Arrays;

public class UpdateEveryElementWithTheMultiplication {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(multiplyElements(arr)));

        System.out.println(Arrays.toString(multiply_Array(arr)));
    }

    static int[] multiplyElements(int[] ints) {
        if (ints == null) return null;
        int n = ints.length;
        if (n == 1) return ints;
        int[] result = new int[n];
        result[0] = ints[0] * ints[1];
        result[n - 1] = ints[n - 1] * ints[n - 2];

        for (int i = 1; i < n - 1; i++) {
            result[i] = ints[i - 1] * ints[i + 1];
        }
        return result;
    }

    static int[] multiply_Array(int[] num) {
        if (num.length <= 1) return num;
        int prev = 1;
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                prev = num[i];
                num[i] = num[i] * num[i + 1];
            }
            else if (i == num.length-1) {
                num[i] = prev * num[i];
            } else {
                int temp = num[i];
                num[i] = prev * num[i + 1];
                prev = temp;
            }
        }
        return num;
    }

}
