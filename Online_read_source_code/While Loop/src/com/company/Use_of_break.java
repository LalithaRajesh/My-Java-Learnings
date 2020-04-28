package com.company;

public class Use_of_break {

    public static void main(String[] args) {
        int number = 0;
        while(number < 15){
            number++;

            if(number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }

        }
    }

}
