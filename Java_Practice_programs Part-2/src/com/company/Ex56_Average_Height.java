package com.company;

//Write a program to calculate the average height of all the students of a class. The number of students and their heights in a class are entered by user
import java.util.Scanner;

public class Ex56_Average_Height {
    public static void main(String[] args) {
        float sum = 0;
        float avg = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int n = s1.nextInt();

        for (int i = 0; i< n;i++){
            System.out.println("Student: " + (i+1));
            System.out.println("Enter the height of the student");
            float height = s1.nextFloat();
            sum = sum + height;
        }
        avg = sum / n;
        System.out.println("Average height of all the students in the class is : " + avg);
    }
}
