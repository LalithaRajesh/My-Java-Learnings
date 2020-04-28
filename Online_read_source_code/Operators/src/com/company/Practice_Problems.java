package com.company;

public class Practice_Problems {
    public static void main(String[] args) {

        double firstVar = 20.00;
        double secondVar = 80.00;
        double total = (firstVar + secondVar) * 100;
        System.out.println("The total is = " + total);
        double findRemainder = total % 40.00;
        System.out.println("The remainder is = " + findRemainder);

        boolean isNoRemainder = (findRemainder == 0) ? true : false;
        System.out.println("Print the result = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
