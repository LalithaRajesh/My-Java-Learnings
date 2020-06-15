package com.company;

import java.util.Scanner;

//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method
//named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
public class Ex49_Rectangle_with_methods {
    double length;
    double breadth;
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the length of Rectangle:");
//        double length = scanner.nextDouble();
//        System.out.println("Enter the width of Rectangle:");
//        double width = scanner.nextDouble();
//        //Area = length*width;
//        double area = length*width;
//        System.out.println("Area of Rectangle is:"+area);
//    }
        Ex49_Rectangle_with_methods rec = new Ex49_Rectangle_with_methods();
        rec.setDim(2, 4);
        System.out.println(rec.getArea());
        rec.setDim(5, 8);
        System.out.println(rec.getArea());
    }

}
