package com.company;

public class Dog  extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
    public Dog(String name, int size, int weight, int eyes, int tail, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew() {
        System.out.println("Dog.Chew() called");
    }
    private void move_always() {
        System.out.println("I roam everywhere and run very fast");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move() {
        System.out.println("Dog.move() called");
        move_always();
        super.move();
    }
}
