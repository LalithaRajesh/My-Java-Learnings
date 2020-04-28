    package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        Account_Constructors bobsAccount = new Account_Constructors();
        bobsAccount.setAccountBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("bob@gmail.com");
        bobsAccount.setAccountNumber("567917345");
        bobsAccount.setCustomerPhoneNumber("9086578909");

        bobsAccount.deposit(250);
        bobsAccount.withdrwal(100.0);

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

        Account_Constructors timsAccount = new Account_Constructors("Tim","Tim@gmail.com",
                "99567843680");
        System.out.println(timsAccount.getAccountNumber() + " name "+ timsAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());

        VipPerson person3 = new VipPerson("Tim", 20000.00, "Tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

        Wall_CodingExercise areaOfWall = new Wall_CodingExercise(5, 4);
        System.out.println("Area = " + areaOfWall.getArea());

        Point first = new Point(6, 5 );
        Point second = new Point(3, 1);
        System.out.println("distance(0, 0 = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2, 2) =" + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());


        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("total = " + calculator.getTotalCost());

    }
}


