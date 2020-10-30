package com.khien.quan_ly_quoc_gia;

public class People extends NameInfo {
    private int peopleId;
    private String email;
    private int numberPhone;

    public People(String lastName, String fistName, String fullName, int peopleId, String email, int numberPhone) {
        super(lastName, fistName, fullName);
        this.peopleId = peopleId;
        this.email = email;
        this.numberPhone = numberPhone;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }
}
