package com.khien.quan_ly_quoc_gia;

public class NameInfo {
    private String lastName;
    private String fistName;
    private String fullName;

    public NameInfo() {
    }

    public NameInfo(String lastName, String fistName, String fullName) {
        this.lastName = lastName;
        this.fistName = fistName;
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
