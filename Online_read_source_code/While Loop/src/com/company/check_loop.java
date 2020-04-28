package com.company;

public class check_loop {

    public static void main(String[] args) {

        int number = 0;
        while (number < 15) {
            number ++;

            if (number <= 5)
                System.out.println("Skipping number " + number);
                continue;
        }
        System.out.println("number= " + number);
    }
}
