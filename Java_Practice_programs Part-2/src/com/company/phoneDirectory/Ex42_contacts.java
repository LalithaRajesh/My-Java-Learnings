package com.company.phoneDirectory;

public class Ex42_contacts {

    private String name;
    private String address;
    private int phoneNumber;
    private String head_of_the_family;

    public Ex42_contacts(String name, int phoneNumber, String address, String head_of_the_family) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.head_of_the_family = head_of_the_family;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name;}
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}
    public String getHead_of_the_family() {
        return head_of_the_family;
    }
    public void setHead_of_the_family(String head_of_the_family) { this.head_of_the_family = head_of_the_family;}
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) { this.address = address;}

}
