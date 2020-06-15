package com.company;

import java.util.Scanner;

public class Ex37_Reverse_a_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String line = scanner.nextLine();
        char[] words = line.toCharArray();
        System.out.println(words);
        String revString = "";
        for(int i = words.length-1; i>=0; i--) {
            revString += words[i];
        }
        System.out.println("Reverse word: "+ revString);
    }
}
