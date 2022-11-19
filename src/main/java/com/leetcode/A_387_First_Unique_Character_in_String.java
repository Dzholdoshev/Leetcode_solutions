package com.leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class A_387_First_Unique_Character_in_String {


    public int firstUniqChar(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1); }

        for (int i = 0; i < str.length(); i++) {
            if (frequencyMap.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;

    }
}
