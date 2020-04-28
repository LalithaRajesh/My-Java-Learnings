package com.company;

public class Wall_CodingExercise {

    private double width;
    private double height;

    public Wall_CodingExercise() {
        System.out.println("Empty constructor called");
    }
    public Wall_CodingExercise(double width, double height) {
        this.width = width <= 0 ? 0 : width;
        this.height = height <= 0 ? 0 : height;
    }


    public double getHeight() {
        return this.height;
    }

    public double getWidth(double width) {
        return this.width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getArea() {
        double area = this.width * this.height;
        return area;
    }
}
