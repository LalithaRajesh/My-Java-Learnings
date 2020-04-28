package com.company;
//Array Reference Types and Values
import java.util.Arrays;

public class Ex15_Array_reference_Types_values {

    public static void main(String[] args) {
        int myArray = 10;
        int anotherValue = myArray;

        System.out.println("myArray = " + myArray);
        System.out.println("anotherValue = " + anotherValue );

        anotherValue++;
        System.out.println("myArray = " + myArray);
        System.out.println("anotherValue = " + anotherValue );

        int[] myIntArray = new int[5];
        int[] anotherIntValue = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntValue));

        anotherIntValue[0] = 5;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntValue));

        modifyArray(myIntArray);
        anotherIntValue = new int[] {3,4,5,6,7};
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntValue));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {2,3,4,5,6};

    }
}
