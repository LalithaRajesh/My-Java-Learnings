package com.company;

public class If_Then_Logical_AND_OR {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        if (isAlien == true) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got a high score");
        }
        if (topScore != 100) {
            System.out.println("You have not got a high score");
        }
        //AND Operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && topScore <= 100) {
            System.out.println("Greater than 2nd top score and less than 100");
        }
        //OR Operator
        if (topScore < secondTopScore || topScore <= 100) {
            System.out.println("Either or both of the condition is true");
        }
    }
}
