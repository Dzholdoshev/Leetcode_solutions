package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A_1_Two_Sum {


    public static void main(String[] args) {


        System.out.println(Arrays.toString(findThePairNumbers(new int[]{3, 3}, 6)));

    }
    public static int[] findThePairNumbers(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        Arrays.sort(arr); // nlog(
        while (left < right) { //n
            if (arr[left] + arr[right] == target)
                return new int[] {arr[left], arr[right]};
            else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }}
            return new int[0];
        }
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for (int i = 0; i<nums.length; i++)
            for (int j = 1; j < nums.length; j++) {

                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;

                    break;


                }
            }


        return arr;
    }

    }