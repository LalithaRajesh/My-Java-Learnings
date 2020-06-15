package com.company;

import java.util.Scanner;

public class Ex54_Array_of_objects {
    String name;
    float salary;
    int date_of_joining;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(int date_of_joining) {
        this.date_of_joining = date_of_joining;
    }
    public void getEmployeeData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of employee: ");
        name = sc.nextLine();
        System.out.println("Enter the salary of the employee ");
        salary = sc.nextFloat();
        System.out.println("Enter the date of joining of the employee");
        date_of_joining = sc.nextInt();
    }
    public void displayEmployeeData(){
        System.out.println("The name of the employee is: " + getName());
        System.out.println("The salary of the employee is: " + getSalary());
        System.out.println("The date of joining is: " + getDate_of_joining());
    }
    public static void main(String[] args){
        Ex54_Array_of_objects[] e1 = new Ex54_Array_of_objects[10];
        for (int i =0; i<3; i++){
            System.out.println("Enter the data of employee with id:");
            e1[i] = new Ex54_Array_of_objects();
            e1[i].getEmployeeData();
        }
        System.out.println("The data of the given employee is: ");
        for(int i = 0; i < 3; i++)
            e1[i].displayEmployeeData();
    }
}
