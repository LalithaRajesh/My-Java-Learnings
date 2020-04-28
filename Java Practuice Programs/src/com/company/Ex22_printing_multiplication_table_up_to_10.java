package com.company;
//Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;

public class Ex22_printing_multiplication_table_up_to_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scanner.nextInt();
        for (int i=0; i<10;i++) {
            System.out.println(num1 + " * " + (i+1) + "= " +(num1 * (i + 1)));
        }
    }
}
