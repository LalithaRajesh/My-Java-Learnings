package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ex10_Vowels_and_consonents {

    public static void main(String[] args) {

        int vcount = 0;
        int ccount=0;
        String str = "This is a really simple sentence";
        str = str.toLowerCase();

        List<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        System.out.println(vowels);


        for (int i=0; i < str.length();i++) {
            char ch = str.charAt(i);
            if (vowels.contains(ch)) {
                vcount++;
            } else {
                ccount++;
            }
        }

    }
}
