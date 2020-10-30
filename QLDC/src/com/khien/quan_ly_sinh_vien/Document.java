package com.khien.quan_ly_sinh_vien;

public class Document {
    private String documentName;
    private String author;
    private String yearOut;
    private int money;

    public Document() {
    }

    public Document(String documentName, String author, String yearOut, int money) {
        this.documentName = documentName;
        this.author = author;
        this.yearOut = yearOut;
        this.money = money;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOut() {
        return yearOut;
    }

    public void setYearOut(String yearOut) {
        this.yearOut = yearOut;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
