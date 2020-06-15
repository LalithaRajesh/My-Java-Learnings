package com.company;

public class Ex52_Employee_table {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(int date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String name;
    int date_of_joining;
    float salary;
    String address;

    public static void main(String[] args){
        Ex52_Employee_table p1 = new Ex52_Employee_table();
        Ex52_Employee_table p2 = new Ex52_Employee_table();
        Ex52_Employee_table p3 = new Ex52_Employee_table();
        p1.setName("Pablo");
        p1.setDate_of_joining(01);
        p1.setSalary(23000);
        p1.setAddress("2, capital point");
        System.out.println("The detail of first employee: " + "\n Name: " + p1.getName() + "\n Date_of_joining: " + p1.date_of_joining + "\n Salary: " + p1.getSalary()
                            + "\n Address: " + p1.getAddress() );
    }
}
