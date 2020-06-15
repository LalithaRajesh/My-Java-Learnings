package com.company;

//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
//creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.
class Ex48_Rectangle {
    int length;
    int breadth;
    public Ex48_Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    public double getArea() {
        double area = (length * breadth);
        return area;
    }
    public double getPerimeter() {
        return 2*(length + breadth);
    }
}

class Answer{
    public static void main(String[] args) {
        Ex48_Rectangle a = new Ex48_Rectangle(4,5);
        Ex48_Rectangle b = new Ex48_Rectangle(5,8);
        System.out.println("Area: "+ a.getArea()+ " Perimeter" + a.getPerimeter());
        System.out.println("Area: "+ b.getArea()+ " Perimeter" + b.getPerimeter());

    }
}
