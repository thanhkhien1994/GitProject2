package com.khien.quan_ly_sinh_vien;

import java.util.Scanner;

public class Name {
    private String fullName;

    public Name(){}

    public Name(String fullName) {
        this.fullName = fullName;
    }

    public void setNameInfo (Scanner scanner){
        System.out.print("\tNhập vào tên đầy đủ: ");
        scanner.nextLine();
        fullName = scanner.nextLine();
    }
    public String getNameInfo(){
        return ("Full name: "+fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
