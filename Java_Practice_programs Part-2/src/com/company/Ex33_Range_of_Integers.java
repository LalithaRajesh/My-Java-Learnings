package com.company;

import java.util.Scanner;

//Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.
public class Ex33_Range_of_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int y = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int z = scanner.nextInt();
        int count=0;
        for (int i= x; i < y+1; i++) {
            if (i % z == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of digits divisible by z is : " + count);
    }

}
