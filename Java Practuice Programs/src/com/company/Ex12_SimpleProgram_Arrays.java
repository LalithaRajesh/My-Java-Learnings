package com.company;

public class Ex12_SimpleProgram_Arrays {

    public static void main(String[] args) {
        int[] myIntArray = new int[25];
        for(int i=0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
            System.out.println("Element " + "i" + ", value is " + myIntArray[i]);
        }
    }
}
