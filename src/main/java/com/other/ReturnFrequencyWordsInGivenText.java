package com.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReturnFrequencyWordsInGivenText {

    public static void main(String[] args) {

        String str = "This is an example of example";
        System.out.println(getFreqOFWords(str));
        System.out.println(withStreamLong(str));
        System.out.println(withStream(str));

    }


    static Map<String, Integer> getFreqOFWords(String str) {
        if (str == null) return null;
        Map<String, Integer> mapOfWords = new HashMap<>();
        // String[] words = str.trim().replaceAll ("[^A-Za-z]+", ""). toLowerCase ().split(" +");
         String[] words = str.trim().toLowerCase ().split("[^A-Za-z]+"); //beginning of string any letter A-Z or a-z
        //String[] words = str.trim().toLowerCase().split("\\W+");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            mapOfWords.put(word, mapOfWords.getOrDefault(word, 0) + 1);
        }
        return mapOfWords;

    }

    static Map<String, Long> withStreamLong(String str) {
        if (str == null) return null;
        return Arrays.stream(str.trim().toLowerCase().split("[^A-Za-z]+"))
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
               // .collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
    }

    static Map<String , Integer> withStream (String str){
        if (str == null ) return null;
        return Arrays.stream(str.trim().toLowerCase().split( "\\W+"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(s->1)));
    }

}