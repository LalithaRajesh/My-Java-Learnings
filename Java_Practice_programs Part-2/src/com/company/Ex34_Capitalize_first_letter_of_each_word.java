package com.company;

//Write a Java program to capitalize the first letter of each word in a sentence.
import java.util.Scanner;

public class Ex34_Capitalize_first_letter_of_each_word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        char y[] = line.toCharArray();
        int size = y.length;

        y[0]=(char)(y[0] -32);
        int i=1;
        while(i != size) {
            if (y[i] == ' ') {
                y[i+1]=(char)(y[i+1] - 32);
            }
            i++;
        }
        System.out.println(line);
        System.out.println(y);
    }
}
