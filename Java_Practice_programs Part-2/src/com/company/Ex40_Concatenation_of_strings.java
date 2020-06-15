package com.company;

//Write a Java program to create the concatenation of the two strings except removing the first character of each string.
// The length of the strings must be 1 and above.


import java.util.Scanner;

public class Ex40_Concatenation_of_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first String");
        String line = scanner.nextLine();
        char[] words = line.toCharArray();
        System.out.println("Enter the second String");
        String line1 = scanner.nextLine();
        char[] words1 = line1.toCharArray();
        String String1 = "";
        StringBuilder String2 = new StringBuilder();
        for (int i = 1; i < words.length; i++) {
            String1 = String1 + words[i];

        }
        System.out.println(String1);
        for (int i = 1; i < words1.length; i++) {
            String2.append(words1[i]);

        }
        System.out.println(String2);
        String resultantString = String1 + String2;
        System.out.println(resultantString);

    }
}
