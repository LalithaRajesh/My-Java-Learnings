package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score1 = 800;
        int levelCompleted1 = 5;
        int bonus1 = 100;

        int score=10000;
        int levelCompleted = 8;
        int bonus = 200;

        if(score1 < 5000 && score1 >1000) {
            System.out.println("Your Score was less than 5000 but greater than 1000");
        } else if(score1 < 1000){
            System.out.println("Your Score was less than 1000");
        } else {
            System.out.println("Got here");
        }
        if (gameOver) {
            int finalScore = score1 + (levelCompleted1 * bonus1);
            System.out.println("Your final Score was = " + finalScore);
            int finalScore1 = score + (levelCompleted * bonus);
            System.out.println("The 2nd final Score is = " + finalScore1 );
        }

    }
}
