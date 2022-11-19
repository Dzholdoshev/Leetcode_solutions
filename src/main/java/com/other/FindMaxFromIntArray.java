package com.other;

import java.util.Arrays;

public class FindMaxFromIntArray {
    public static int maxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int maxValueWithStream(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }


}
