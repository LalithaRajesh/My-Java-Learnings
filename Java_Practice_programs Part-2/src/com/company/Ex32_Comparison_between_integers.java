package com.company;
import java.util.Scanner;

// Write a Java program that accepts three integers from the user and return true if the second number is greater
// than first number and third number is greater than second number.
// If another variable "abc" is true second number does not need to be greater than first number.
public class Ex32_Comparison_between_integers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number");
        int y = scanner.nextInt();
        System.out.println("Enter the third number");
        int z = scanner.nextInt();
        System.out.print("The result is: " + test(x, y, z, true));

    }
    public static boolean test(int x, int y, int z, boolean xyz) {
        {
            if(xyz)
                return (z > y);
            return (y > x && z > y);
        }
    }
}
