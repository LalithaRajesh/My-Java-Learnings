package com.company;


import java.util.Scanner;

//How to Print an Integer entered by an user
public class Ex01_print_Integer_by_user {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number ");

        // nextInt() The nextInt() method of a Scanner object reads in a string of digits (characters) and
        // converts them into an int type. ... Usually that value is stored in an int variable.
        // The picture shows a program that reads in character data and then converts it into an integer
        // which is stored in num .
        int number = reader.nextInt();

        System.out.println("You Entered" + number);
    }
}
