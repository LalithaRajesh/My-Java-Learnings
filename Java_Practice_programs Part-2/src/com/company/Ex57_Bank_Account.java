package com.company;

//Lets create a bank account. Create a class named 'BankAccount' with the following data members
//1 - Name of depositor
//2 - Address of depositor
//3 - Type of account
//4 - Balance in account
//5 - Number of transactions
//    Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
//    For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
//2 - Display information and balance of depositor
//3 - Deposit more amount in balance of any depositor
//4 - Withdraw some amount from balance deposited
//5 - Change address of depositor
//    After creating the class, do the following operations
//1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
//2 - Print the information of any depositor.
//            3 - Add some amount to the account of any depositor and then display final information of that depositor
//4 - Remove some amount from the account of any depositor and then display final information of that depositor
//5 - Change the address of any depositor and then display the final information of that depositor
//6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.

import java.util.Scanner;

public class Ex57_Bank_Account {
    String depositor_name;
    String depositor_address;
    String account_type;
    double account_balance;
    int number_of_transactions;
    String account_number = "BA000";

    public Ex57_Bank_Account(){
        this.account_balance = account_balance;
        this.account_number = account_number;
        this.depositor_name = depositor_name;
        this.depositor_address = depositor_address;
        this.account_type= account_type;
        this.number_of_transactions= number_of_transactions;
    }

    public String getDepositor_name() {
        return depositor_name;
    }

    public void setDepositor_name(String depositor_name) {
        this.depositor_name = depositor_name;
    }

    public String getDepositor_address() {
        return depositor_address;
    }

    public void setDepositor_address(String depositor_address) {
        this.depositor_address = depositor_address;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public int getNumber_of_transactions() {
        return number_of_transactions;
    }

    public void setNumber_of_transactions(int number_of_transactions) {
        this.number_of_transactions = number_of_transactions;
    }
    public void setAccount_number(String account_number) {
            this.account_number = account_number;
    }
    public String getAccount_number() {
        return account_number;
    }
    public void increment() {
        setAccount_number(getAccount_number() + 1);

    }
    public void add_deposit(double amount){
        double newBalance = this.account_balance + amount;
        this.account_balance = newBalance;
    }
    public void withdraw(double amount) {
        double newBalance = this.account_balance - amount;
        this.account_balance = newBalance;
    }

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the depositor's name: ");
        this.depositor_name = sc.nextLine();
        System.out.println("Enter the depositor's address: ");
        this.depositor_address = sc.nextLine();
        System.out.println("Enter the account type");
        this.account_type = sc.nextLine();
        System.out.println(" Enter the number of transactions");
        this.number_of_transactions = sc.nextInt();
        System.out.println("Enter the account balance");
        this.account_balance= sc.nextDouble();
    }
    public static void main(String[] args) {
        Ex57_Bank_Account bankAccount = new Ex57_Bank_Account();
        bankAccount.setAccount_number("BA000");
        for (int i=0;i<2;i++) {
            if(i==0) {
                bankAccount.getDetails();
                System.out.println(bankAccount.getAccount_balance());
                System.out.println(bankAccount.getAccount_number());
                bankAccount.add_deposit(90);
                System.out.println(bankAccount.getAccount_balance());

            } else {
                bankAccount.getDetails();
                bankAccount.increment();
                System.out.println(bankAccount.getAccount_number());
                bankAccount.withdraw(100);
                System.out.println(bankAccount.getAccount_balance());
            }

        }

    }


}