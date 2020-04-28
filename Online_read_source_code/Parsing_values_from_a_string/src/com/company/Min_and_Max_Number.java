package com.company;

import java.util.Scanner;

public class Min_and_Max_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxOfNumbers = 0;
        int minOfNumbers = 0;
        boolean first = true;
        int count = 0;
        while(count < 4) {

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    first=false;
                    minOfNumbers = number;
                    maxOfNumbers = number;
                }
                count++;
                if(number > maxOfNumbers){
                    maxOfNumbers = number;
                    System.out.println("Th maximum number is" + maxOfNumbers);
                } else if(number < minOfNumbers){
                    minOfNumbers = number;
                    System.out.println("Th minimum number is" + minOfNumbers);
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Min= " +minOfNumbers + "," + "Max = " + maxOfNumbers);
        scanner.close();
    }
}
