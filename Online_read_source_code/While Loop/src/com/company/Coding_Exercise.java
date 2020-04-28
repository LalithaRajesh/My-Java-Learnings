package com.company;

public class Coding_Exercise {

    public static void main(String[] args) {

        sumDigits(1);
    }
    private static int sumDigits(int number) {

        int sum = 0;
        if (number >= 10) {
            sum = sum + number;
            System.out.println("The sum of all Digits are" + sum);
        } else {
            System.out.println("Invalid number");
        }
        return sum;
    }
}
