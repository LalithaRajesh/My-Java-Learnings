package com.company;

//The below commented code was first implemented without the usage of SUPER Keyword.
//So, when nc.maxSpeed is called, the output displayed is 100.
//class Vehicle_Using_Super {
//    int maxSpeed = 120;
//}
//class NiceCar extends Vehicle_Using_Super {
//    int maxSpeed = 100;
//    public void display() {
//        System.out.println(maxSpeed);
//    }
//Now, let us add the super keyword to the above same class.

class Vehicle_Using_Super {
    int maxSpeed = 120;
}
class NiceCar extends Vehicle_Using_Super {
    int maxSpeed = 100;

    public void display() {
        System.out.println(super.maxSpeed);
    }
}