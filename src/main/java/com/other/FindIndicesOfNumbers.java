package com.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindIndicesOfNumbers {

    public static int[] findIndicesWithTwoPointerAndTreeMap(int[] arr, int target) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        while (!map.firstKey().equals(map.lastKey())) { // n
            if (map.firstKey() + map.lastKey() == target) {
                return new int[]{map.firstEntry().getValue(), map.lastEntry().getValue()};
            } else if (map.firstKey() + map.lastKey() < target) {
                map.remove(map.firstKey());
            } else
                map.remove(map.lastKey());
        }
        return new int[0];
    }


    public static int[] findIndicesWithTwoPointerAndHashMap (int [] arr , int target) {
        int left = 0 , right = arr. length-1;
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++) { // n
            map.put(arr[i], i);
        }
            Arrays.sort(arr); // n log(
            while (left < right) { // n
                if (arr[left] + arr[right] == target) {
                    return new int[]{map.get(arr[left]), map.get(arr[right])};
                } else if (arr[left] + arr[right] < target) {
                    left++;
                } else
                    right--;
            }
            return new int[0];


        }
}