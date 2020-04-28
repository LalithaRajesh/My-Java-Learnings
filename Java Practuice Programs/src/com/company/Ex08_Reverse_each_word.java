package com.company;
//Write a program that reverses the letters of each word and a program that reverses the letters of each word and the words themselves.
public class Ex08_Reverse_each_word {

    public static void main(String[] args) {
        String str = "Java Programming";
        String[] words = str.split(" ");
         String revString = "";

        for(int i = 0; i < words.length; i++) {
            String revWord = "";
            String word  = words[i];

            for(int j = word.length()-1; j >= 0 ;j--) {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.println(revString);
    }
}
