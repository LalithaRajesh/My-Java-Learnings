package com.company;

public class FizzBuzzProgram {

    public String play(int number) {

        if (number % 3 == 0) {
            return "FIZZ";
        } else if (number % 5 == 0) {
            return "BUZZ";
        } else {
            return "INVALID";
        }
    }
}
