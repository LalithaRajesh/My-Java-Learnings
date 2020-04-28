package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Min_Max_Number_2nd_Method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int count = 0;

        while(count < 4) {
            System.out.println("Enter the number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;

                if(number  > max) {
                    number = max;
                    System.out.println("Th maximum number is " + max);
                } else if(number < min) {
                    number = min;
                    System.out.println("The minimum number is " + min);
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Min= " +min + "," + "Max = " + max);
        scanner.close();
    }

}
