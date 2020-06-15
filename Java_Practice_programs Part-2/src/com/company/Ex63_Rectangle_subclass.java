package com.company;

//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area
//and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to
//initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor
//having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
//Print the area and perimeter of a rectangle and a square.


class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double side, double side1) {
    }

    public double getArea() {
        double area  = length * breadth;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*( length+ breadth);
        return perimeter;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getLength() {return length;}
    public double getBreadth() {return breadth;}
    public void printArea(){
        System.out.println("The area of rectangle is: " + getArea());
    }
    public void printPerimeter() {
        System.out.println("The perimeter of rectangle is: " + getPerimeter());
    }
}

class Square extends Rectangle {
    public Square(double length) {
        super(length, length);
    }
}
public class Ex63_Rectangle_subclass {
    public static void main(String[] args) {
        Square s = new Square(10);
        System.out.println(s.getArea());  //Prints out 100
    }

}
