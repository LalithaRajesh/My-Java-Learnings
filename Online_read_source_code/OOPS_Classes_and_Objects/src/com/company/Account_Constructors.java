package com.company;

public class Account_Constructors {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account_Constructors() {
        System.out.println("Empty constructor called");
    }

    public Account_Constructors(String accountNumber, double accountBalance, String customerName,
                                String customerEmailAddress, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

        System.out.println("Account constructor with parameters called");
    }

    public Account_Constructors(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.0, customerName, customerEmailAddress,customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this. accountBalance);
    }
    public void withdrwal(double withdrawalAmount) {
        if(this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Only " + this.accountBalance + " available. ");
        } else {
            this.accountBalance = this.accountBalance - withdrawalAmount;
            System.out.println("Withdrwal of " + withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);

        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
