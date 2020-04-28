package com.company;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator() {
        System.out.println("Empty Constructor was called");
    }
    public Calculator (Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost () {
        return floor.getArea() * carpet.getCost();
    }
}
