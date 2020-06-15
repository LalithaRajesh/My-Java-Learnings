package com.company;

//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.

import java.util.Scanner;

public class Ex55_Marks {
    int roll_no;
    int subject1;
    int subject2;
    int subject3;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1");
        this.subject1 = sc.nextInt();
        System.out.println("Enter the marks of subject2");
        this.subject2 = sc.nextInt();
        System.out.println("Enter the marks of subject3");
        this.subject3 = sc.nextInt();
        System.out.println("Enter the roll number");
        this.roll_no = sc.nextInt();
    }
    public int getAverage(){
        int avg = (getSubject1() + getSubject2() + getSubject3()) / 3;
        return avg;
    }
    public void printAverage(){
        System.out.println("The average is : " + getAverage());
    }
    public void printRollNum(){
        System.out.println("The roll number of the student is: " + getRoll_no());
    }
    public static void main(String[] args){
        Ex55_Marks[] e1 = new Ex55_Marks[8];
        for(int i=0; i<2; i++) {
            System.out.println("Enter the data of student with id:");
            e1[i] = new Ex55_Marks();
            e1[i].getDetails();
            e1[i].printAverage();
        }
        System.out.println("Roll number details");
        for(int i=0; i<2; i++){
            e1[i].printRollNum();
        }
    }
}
