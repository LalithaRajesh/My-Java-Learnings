package com.company;

public class Even_Number {

    public static void main(String[] args) {

        isEvenNumber(4);
        isEvenNumber(9);
        ischeckeven(6);

    }
    public static void isEvenNumber(int num) {
        if(num % 2 == 0) {
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " is not a even number");
        }
    }

    public static void ischeckeven(int num) {

        int count = 1;
        while (count <= 10) {
            System.out.println("Count value was " + count);
            count++;
        }

        for (int i = 10; i < 11; i++) {
            if (num % 2 == 0) {
                System.out.println(num + " is a even number");
            } else {
                System.out.println(num + " is not a even number");
            }
        }

    }
}
