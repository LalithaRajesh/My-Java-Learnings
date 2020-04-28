package com.company;

public class Even_Digit_Sum {

    public static void main(String[] args) {
        getEvenDigitSum(123456789);

    }
    public static void getEvenDigitSum(int number) {
        String str1 = Integer.toString(number);
        for (int i = 1; i < str1.length(); i += 2) {
            System.out.println(str1.charAt(i));
            int myInt = Integer.parseInt(str1.charAt(i));
            System.out.println("Integer Value is" + myInt);

        }
    }
}
