package com.company;
//Write a Java program to convert a given string into lowercase
//Write a Java program to convert a given string into uppercase
//Formula: lowercase - 32 = uppercase
import java.util.*;
public class Ex35_Conversion_to_lowercase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        System.out.print("Input a 2nd String: ");
        String line1 = in.nextLine();
        line1 = line1.toUpperCase();
        System.out.println(line1);
    }
}