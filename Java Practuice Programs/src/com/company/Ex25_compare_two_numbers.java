package com.company;

//write a Java program to compare two integers
import java.util.Scanner;

public class Ex25_compare_two_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        if(num1 == num2) {
            System.out.printf("%d == %d\n", num1, num2);
        }
        if(num1 != num2){
            System.out.printf("%d != %d \n", num1,num2);
        }
        if(num1 < num2){
            System.out.printf("%d < %d \n", num1,num2);
        }
        if(num1 > num2){
            System.out.printf("%d > %d \n", num1,num2);
        }
        if(num1 >= num2){
            System.out.printf("%d >= %d \n", num1,num2);
        }
        if(num1 <= num2){
            System.out.printf("%d <= %d \n", num1,num2);
        }
    }
}
