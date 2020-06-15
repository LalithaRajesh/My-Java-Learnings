package com.company;

//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex43_Sorting {
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] = 10;
        a[1] = 23;
        a[2] = 9;
        a[3] = 4;
        a[4] = 27;
        a[5]= 65;
        a[6]= 54;
        a[7] = 55;
        a[8] = 48;

        System.out.printf("Initial a[] : %s", Arrays.toString(a));
        Arrays.sort(a);
//        Arrays.sort(a, Collections.reverseOrder());
        System.out.printf("Modified a[] : %s", Arrays.toString(a));


        String b[] = new String[5];
        b[0] = "A";
        b[1]= "V";
        b[2]="F";
        b[3]="D";
        b[4]="K";

        System.out.printf("Initial arr[] : %s", Arrays.toString(b));
        Arrays.sort(b);
        System.out.printf("Modified arr[] : %s", Arrays.toString(b));

    }


}
