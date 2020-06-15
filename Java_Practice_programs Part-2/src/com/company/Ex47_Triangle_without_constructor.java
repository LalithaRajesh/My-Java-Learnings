package com.company;

class Ex47_Triangle_without_constructor {
    int a, b, c;
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double getPerimeter() {
        return (a+b+c) / 2.0;
    }
}

class answer{
    public static void main(String[] args) {
        Ex47_Triangle_without_constructor t = new Ex47_Triangle_without_constructor();
        t.a = 2;
        t.b = 3;
        t.c = 4;
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
    }
}
