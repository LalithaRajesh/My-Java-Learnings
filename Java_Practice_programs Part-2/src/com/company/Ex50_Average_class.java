package com.company;

//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.util.Scanner;

public class Ex50_Average_class {

    int a, b, c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getAverage() {
        int avg = (getA()+ getB() + getC()) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Ex50_Average_class average = new Ex50_Average_class();
        average.setA(10);
        average.setB(3);
        average.setC(8);
        System.out.println(average.getAverage());
    }

}
