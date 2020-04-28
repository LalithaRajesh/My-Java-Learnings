package com.company;

//Write a program that counts duplicate characters from a given string.
public class Ex05_searching_duplicate_character_in_a_string {
    public static void main(String[] args) {
        String string1 = "The tree have very big branches and roots";
        System.out.println(string1);
        //This is just to print the First character
        //System.out.println(string1.charAt(0));
        //To eliminate all duplicate characters, let us define an other string
        String chars = "";
        String duplicates = "";
        //To read all the characters in a string
        for(int i = 0; i < string1.length(); i++) {
            //System.out.println(string1.charAt(i));
            String word = Character.toString(string1.charAt(i));
            if(chars.contains(word)) {
                if(!duplicates.contains(word)) {
                    duplicates += word + ",";
                }
            }

            chars += word;

        }
        System.out.println(duplicates);
        System.out.println(chars);
    }
}

