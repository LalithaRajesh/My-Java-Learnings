package com.company;

public class Main {

    public static void main(String[] args) {
//        int[] myIntArray = new int[20];
//        myIntArray[0] = 10;
//        myIntArray[5] = 50;
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[0]);
//        int [] myIntArray = {1, 2,3 ,4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        System.out.println(myIntArray[5]);
        int[] myIntArray = new int[25];
        for(int i=0; i < myIntArray.length; i++) {
            myIntArray[i] = i*10;
            System.out.println(myIntArray[i]);
        }
    }
}
