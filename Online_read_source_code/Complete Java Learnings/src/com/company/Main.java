package com.company;

public class Main {

    public static void main(String[] args) {
//	    Car c = new Car();
//        System.out.println(c.maxSpeed); // Solution 1: Here 120 gets printed out as an o/p.

//        NiceCar nc = new NiceCar();
//        System.out.println(nc.maxSpeed); // Solution 2: Here 100 gets printed out as an o/p.

        NiceCar nc = new NiceCar();
        nc.display(); // Solution 3: Here 120 gets printed out as an o/p after using the super keyword.

    }
}
