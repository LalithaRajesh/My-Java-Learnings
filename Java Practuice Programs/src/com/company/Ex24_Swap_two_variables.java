package com.company;


// Write a Java program to swap two variables.

import java.util.Scanner;

public class Ex24_Swap_two_variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The 1st number");
        int num1 = scanner.nextInt();
        System.out.println("enter the 2nd number");
        int num2 = scanner.nextInt();
        int temp = num1;
        num1 = num2;
        System.out.println("The value of 1st variable is = " + num1);
        num2 = temp;
        System.out.println("The value of 2nd variable is = " + num2);
    }
}
