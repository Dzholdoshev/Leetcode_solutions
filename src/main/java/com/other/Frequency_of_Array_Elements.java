package com.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_of_Array_Elements {
    public static Map<String, Integer> solutionWithStream1(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(strings) // Streaming over strings
                .filter(Objects::nonNull)
                .distinct() // Stream is working on the distinct elements of the strings
                // performs the below code for each element of the strings
                .forEach(e -> map.put(e, (int) Arrays.stream(strings)
                        .filter(p -> p != null && p.equals(e))
                        .count()));
// put method adds all unique elements of the strings one by one with their occurrence counts.
        return map;
    }

    public static Map<String, Long> solutionWithStream2(String[] strings) {
        return Arrays.stream(strings)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


}