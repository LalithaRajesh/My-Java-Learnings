package com.company;

//Write a Java program that accepts two integer values from the user and return the larger values.
//However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.

import java.util.Scanner;

public class Ex39_Conditional_checks_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the 2nd number");
        int y = scanner.nextInt();
        System.out.println("Result: " + result(x, y));
    }
    public static int result(int x, int y) {

        if (x == y) {
            return 0;
        } else if (x % 6 == y % 6) {
            return (x < y) ? x : y;
        } else {
            return (x > y) ? x : y;
        }
    }
}
