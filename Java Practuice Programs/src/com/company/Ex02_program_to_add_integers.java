package com.company;


import java.util.Scanner;

//Java Program to Add Two Integers
public class Ex02_program_to_add_integers {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first_num = num.nextInt();
        System.out.println("Enter the second number");
        int second_num = num.nextInt();

        int sum = first_num + second_num;
        System.out.println("The sum of two numbers are: " + sum);
    }
}
