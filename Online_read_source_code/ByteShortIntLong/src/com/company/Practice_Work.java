package com.company;

public class Practice_Work {
    public static void main(String[] args) {

        byte myByteNumber = Byte.MAX_VALUE;
        short myShortNumber = Short.MIN_VALUE;
        int myIntNumber = Integer.MAX_VALUE;

        long myTotal = 50000 + 10 * (myByteNumber + myIntNumber + myShortNumber);
        System.out.println(myTotal);
    }
}
