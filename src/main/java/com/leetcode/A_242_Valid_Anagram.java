package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class A_242_Valid_Anagram {
    public boolean withMap(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            // if (map.containsKey(ch)) {
            // map.put(ch, map.get(ch + 1);
            // } else {
            // map.put(ch, 1);
            // }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) == 1) {
                    map.remove(t.charAt(i));
                } else {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        return map.size() == 0;
    }
}
