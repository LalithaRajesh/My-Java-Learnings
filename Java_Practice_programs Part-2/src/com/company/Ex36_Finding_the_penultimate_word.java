package com.company;
//Write a Java program to find the penultimate (next to last) word of a sentence.

import java.util.Scanner;

public class Ex36_Finding_the_penultimate_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println(words[words.length -2]);
    }
}
