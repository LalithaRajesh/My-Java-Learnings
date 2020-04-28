package com.company;

// How to sort the array in Descending Order
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex14_Arrays_Descending_order {

    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        int[] myIntegers = getIntegers(5);
//        System.out.println("The average is " + printArray(myIntegers));
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer Values");

        int[] values = new int[number];
        for(int i=0; i< values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }
    public static int[] sortingArray(int[] arrays) {
        int[] sortedArray = new int[arrays.length]; // creating a new array similar to the length of existing array
        for (int i = 0; i < arrays.length; i++) {
            sortedArray[i] = arrays[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i < sortedArray.length; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
