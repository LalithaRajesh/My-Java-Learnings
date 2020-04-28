package com.company;

public class parsing_values_from_a_string {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString =" + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number =" + number);

    }
}
