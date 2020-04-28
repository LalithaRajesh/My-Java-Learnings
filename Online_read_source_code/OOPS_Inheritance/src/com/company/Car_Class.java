package com.company;

public class Car_Class {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear

    public Car_Class(int wheels, int doors, int gears, boolean isManual, int currentGear) {
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }
    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }
}
