package com.company;

public class leapYear {

    public static void main(String[] args) {

        isLeapYear(2020);

    }
    public static void isLeapYear(int year) {

        if((year < 1) && (year > 9999)) {
            System.out.println("Invalid Value");
        }
        if((year % 4 == 0) && (year % 100 != 0 ) && (year % 400 != 0)) {
            System.out.println("Its a Leap Year");
        } else {
            System.out.println("Its not a Leap Year ");
        }
    }
}
