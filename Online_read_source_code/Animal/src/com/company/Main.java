package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,6);
        Dog dog = new Dog("Terry", 4, 5, 2, 1, 4, 20,"Long Silky");
        dog.eat();
        dog.move();
    }
}
