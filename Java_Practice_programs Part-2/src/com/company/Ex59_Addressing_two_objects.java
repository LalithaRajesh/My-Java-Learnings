package com.company;

//Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
//respectively by creating two objects of class 'Student'.

public class Ex59_Addressing_two_objects {
    int roll_no;
    int phone_num;
    String name;
    String address;

    public static void main(String[] args) {
        Ex59_Addressing_two_objects s1 = new Ex59_Addressing_two_objects();
        Ex59_Addressing_two_objects s2 = new Ex59_Addressing_two_objects();
        s1.name = "Jan";
        s1.roll_no = 1001;
        s1.phone_num = 994157868;
        s1.address = "1, capital point";
        System.out.println("The name of the Student is "+s1.name + " ,his roll number is " + s1.roll_no +
                " his phone number is " + s1.phone_num + " stays on the below address " + s1.address);

        s2.name = "Lal";
        s2. roll_no = 1002;
        s2.phone_num= 888680897;
        s2.address = "2, capital point";
        System.out.println("The name of the Student is "+s2.name + " ,his roll number is " + s2.roll_no +
                " his phone number is " + s2.phone_num + " stays on the below address " + s2.address);
    }
}
