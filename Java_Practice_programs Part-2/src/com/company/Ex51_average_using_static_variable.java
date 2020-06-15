package com.company;

class Ex51_average_using_static_variable {
    int a,b,c;
    public double getAverage() {
        double avg = (a + b + c) / 3;
        return avg;
    }
}

class One {
    public static void main(String[] args) {
        Ex51_average_using_static_variable avg = new Ex51_average_using_static_variable();
        avg.a = 10;
        avg.b = 3;
        avg.c = 8;
        System.out.println(avg.getAverage());
    }
}