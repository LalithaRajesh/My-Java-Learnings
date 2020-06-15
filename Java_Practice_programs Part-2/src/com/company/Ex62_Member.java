package com.company;

//Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members
//'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and
//a manager by making an object of both of these classes and print the same.
class Member {
    String name;
    int age;
    int phoneNumber;
    int address;
    int salary;

    public void printSalary(){
        System.out.println(salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

class Ex62_Member {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        e.name =  "Lal";
        e.age = 30;
        e.phoneNumber = 745778909;
        e.specialization = "Java";
        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.phoneNumber);
        System.out.println(e.specialization);
        m.name =  "Janani";
        m.age = 3;
        m.phoneNumber = 745778656;
        m.department = "LKG";
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.phoneNumber);
        System.out.println(m.department);

    }
}