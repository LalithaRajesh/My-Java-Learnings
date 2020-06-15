package com.company;

//Write a Java program to create a new string taking first and last characters from two given strings.
//If the length of either string is 0 use "#" for missing character.


import java.awt.*;
import java.util.Scanner;

public class Ex41_Concatenation_of_Strings_part_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String1");
        String line = scanner.nextLine();
        char[] words = line.toCharArray();
        String String1 = "";
        String String2 = "";
        int length2 = String2.length();
        System.out.println("Enter the String2");
        String line1 = scanner.nextLine();
        char[] words1 = line1.toCharArray();
        for (int i=0; i < words.length; i++) {
            String1 = String1 +String1.charAt(0);
            System.out.println(String1);
        }

        for (int i=words1.length-1;i>=0; i--) {
            String2 = String2 +String2.charAt(length2-1);
            System.out.println(String2);
        }

    }
}
