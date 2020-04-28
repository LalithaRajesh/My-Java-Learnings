package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {


        int myMinNumber = Integer.MIN_VALUE;
        int myMaxNumber = Integer.MAX_VALUE;
        System.out.println("The Minimum Number is = " + myMinNumber);
        System.out.println("The Maximum Number is = " + myMaxNumber);
        System.out.println("Threshold Min Number = " + (myMinNumber - 1));
        System.out.println("Threshold Max Number = " + (myMaxNumber + 1));

        byte myMinByteNumber = Byte.MIN_VALUE;
        byte myMaxByteNumber = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteNumber);
        System.out.println("Byte Maximum value = " + myMaxByteNumber);
        
        short myMinShortNumber = Short.MIN_VALUE;
        short myMaxShortNumber = Short.MAX_VALUE;
        System.out.println("Short Min Value = "+ myMinShortNumber);
        System.out.println("Short Max value = " + myMaxShortNumber);

        long myNewValue = 100L;
        long myMinLongNumber = Long.MIN_VALUE;
        long myMaxLongNumber = Long.MAX_VALUE;
        System.out.println("Long Min Value = "+ myMinLongNumber);
        System.out.println("Long Max value = " + myMaxLongNumber);

        int myNewIntNumber = (myMaxNumber / 2);
        System.out.println(myNewIntNumber);
        byte myNewByteNumber = (byte) (myMaxByteNumber / 2);
        System.out.println(myNewByteNumber);
    }
}
