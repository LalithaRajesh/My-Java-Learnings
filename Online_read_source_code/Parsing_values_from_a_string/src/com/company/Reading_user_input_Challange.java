package com.company;

import java.util.Scanner;

public class Reading_user_input_Challange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count = 0;
        int sum = 0;
        while(true) {
            int order = count + 1;
            System.out.println("Enter number #: " + order +":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                if(count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum =" + sum);
        scanner.close();

    }
}
