package com.other;

public class CountDuplicatedLetters {

    public static void main(String[] args) {
        System.out.println(  getNumber("appless") );
    }
   static int getNumber(String str) {
        str = str.toLowerCase();
        String temp = "";
        String output = "";
        for (char ch : str.toCharArray()) {
            if (!temp.contains(ch + "")) {
                temp += ch;
            } else if (!output.contains(ch + "")) {
                output += ch;
            }
        }
        return output.length();  //2 ("p","s")
    }
}
