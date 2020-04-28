package com.company;

import java.util.Scanner;

public class Ex03_Multiply_Floating_point_numbers {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first number");
        float first_num = num.nextFloat();

        System.out.println("Enter the second number");
        float second_num = num.nextFloat();

        float result = first_num * second_num;
        System.out.println("The result of two numbers are " + result);

    }
}
