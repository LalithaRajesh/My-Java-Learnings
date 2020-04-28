package com.company;

//How to resize Java Arrays

import java.util.Scanner;

public class Ex19_Resizing_an_array {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers");
        getInput();
        printArray(baseData);
    }
    private static void getInput() {
        for(int i=0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for (int i=0;i< original.length;i++) {
            original[i] = baseData[i];
        }
    }
}
