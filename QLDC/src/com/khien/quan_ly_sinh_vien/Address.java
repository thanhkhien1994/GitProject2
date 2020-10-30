package com.khien.quan_ly_sinh_vien;

import java.util.Scanner;

public class Address {
    private int homeID;
    private String streetName;
    private String addressName;

    public Address(){ }

    public Address(int homeID, String streetName, String addressName) {
        this.homeID = homeID;
        this.streetName = streetName;
        this.addressName = addressName;
    }

    public void setAddressInfo(Scanner scanner){
        System.out.print("\tNhập vào số nhà: ");
        homeID = Integer.parseInt(scanner.nextLine());
        System.out.print("\tNhập vào tên đường: ");
        streetName = scanner.nextLine();
        System.out.print("\tNhập vào địa chỉ cụ thể: ");
        addressName = scanner.nextLine();
    }
    public String getInfoAddress(){
        return ("Địa chỉ: "+homeID+", "+ streetName+", "+ addressName+".");
    }

    public int getHomeID() {
        return homeID;
    }

    public void setHomeID(int homeID) {
        this.homeID = homeID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
