package com.company;
//Write a program that returns the first non-repeated character from a given string.
import java.io.*;
import java.util.*;
class OccuranceOfCharInString {
    static void charCount(String inputString) {
        HashMap <Character,Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c: strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c,1);
            }

        }
        for (int j=0; j < inputString.length(); j++) {
            Character ch = inputString.charAt(j);
            if (charCountMap.get(ch) == 1 ) {
                System.out.println( "The first non-repeated character is " + ch);
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "the tree has bigger roots";
        charCount(str);
    }
}
