package com.company;

//Java Exercises: Display the product of two numbers

import java.util.Scanner;

public class Ex21_Display_the_product_of_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("The product of two numbers = " + (num1 * num2));
    }
}
