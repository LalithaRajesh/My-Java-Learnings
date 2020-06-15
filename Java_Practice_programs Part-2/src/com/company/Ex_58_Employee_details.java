package com.company;

class Employee_details {

    float salary;
    float number_of_hrs_worked;

    public void getInfo() {
        System.out.println("The number of hours worked by the employee is " + getNumber_of_hrs_worked() + " and the salary he gets is " + getSalary());
    }

    public float add_salary() {
        if (this.salary <= 500) {
            this.salary = this.salary + 10;
        } else {
            this.salary = salary;
        }
        return this.salary;
    }

    public float add_work() {
        if (number_of_hrs_worked >= 6) {
            salary = salary + 5;
        } else {
            this.salary = salary;
        }
        return salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getNumber_of_hrs_worked() {
        return number_of_hrs_worked;
    }

    public void setNumber_of_hrs_worked(float number_of_hrs_worked) {
        this.number_of_hrs_worked = number_of_hrs_worked;
    }

}

class get_details{
    public static void main(String[] args) {
        Employee_details e1 = new Employee_details();
        e1.setSalary(600);
        e1.setNumber_of_hrs_worked(7);
        System.out.println("The details of the employee is : ");
        e1.getInfo();
        System.out.println(e1.add_salary());
        System.out.println(e1.add_work());
    }

}