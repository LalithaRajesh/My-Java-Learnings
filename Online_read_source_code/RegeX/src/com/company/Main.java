package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
	    String string = " I am a string. Yes I am.";
        System.out.println(string);
        String change_string = string.replaceAll("I", "You");
        System.out.println(change_string);

        String alphanumeric = "aaaabbbccthhrf188890djjihfcggiuhiuh7698y654e4576fytfj";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("^aaaabbb", "YY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("aaaabbbccthhrf188890djjihfcggiuhiuh7698y654e4576fytfj"));

        System.out.println(alphanumeric.replaceAll("uh7698", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));

        String newAlphanumeric = "abcdddgghe8976789chjvgvhjk";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));

        String hasWhiteSpace = " Its a quick brown fox\teating the bone outside the house";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\W", "X"));
    }
}
