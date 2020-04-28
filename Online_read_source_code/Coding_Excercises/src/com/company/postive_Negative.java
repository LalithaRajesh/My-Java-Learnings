package com.company;

public class postive_Negative {

    public static void main(String[] args) {

        checkNumbers(5);
        checkNumbers(-19);
        checkNumbers(0);
    }
    public static void checkNumbers(int numbers) {

        if (numbers > 0) {
            System.out.println("It is a positive number");
        } else if (numbers < 0) {
            System.out.println("It is a negative number");
        } else if(numbers == 0){
            System.out.println("It is zero");
        }
    }
}
