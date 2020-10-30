package com.khien.quan_ly_sinh_vien;

import java.util.Scanner;

public class Human {
    private Name name ;
    private Address address;

    private int identityID;
    private String email;
    private int phoneNumber;

    public Human() {
    }

    public Human(int ID, String email, int phoneNumber) {
        this.identityID = ID;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setHumanInfo(Scanner scanner) {
        name = new Name();
        address = new Address();
        name.setNameInfo(scanner);
        address.setAddressInfo(scanner);
        System.out.print("\tEnter number identity: ");
        identityID = scanner.nextInt(); scanner.nextLine();
        System.out.print("\tEnter email: ");
        email = scanner.nextLine();
        System.out.print("\tEnter phone number: ");
        phoneNumber = scanner.nextInt();
    }

    public void showInfoHuman() {
        System.out.println(
                address.getInfoAddress() +"\n"+
                name.getNameInfo() +"\n"+
                phoneNumber+"\n"+
                email+"\n"+
                identityID
        );
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getIdentityID() {
        return identityID;
    }

    public void setIdentityID(int identityID) {
        this.identityID = identityID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
