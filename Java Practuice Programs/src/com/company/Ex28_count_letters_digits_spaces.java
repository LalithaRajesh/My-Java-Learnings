package com.company;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string.
public class Ex28_count_letters_digits_spaces {

    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);
    }
    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int spaces = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                digits++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + spaces);
        System.out.println("number: " + digits);
        System.out.println("other: " + others);
    }
}
