package com.company;

public class Floor {

    private double width;
    private double length;

    public Floor() {
        System.out.println("Empty Constructor is called");
    }
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        this.width = width;
        return width;
    }
    public double getLength() {
        this.length = length;
        return length;
    }
    public void setWidth (double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setLength (double length) {
        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public double getArea() {
        double area = this.width * this.length;
        return area;
    }
}
