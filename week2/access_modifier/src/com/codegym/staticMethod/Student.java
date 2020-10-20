package com.codegym.staticMethod;

public class Student {
    private int stt;
    private String name;
    private static String congTy = "BBDIT";

    //hàm tạo để khởi tạo biến
    Student(int stt, String n) {
       this.stt = stt;
        name = n;
    }

    //phương thức static để thay đổi giá trị của biến static
     static void change() {
        congTy = "CODEGYM";
    }

    //Hiển thị giá trị
    void display() {
        System.out.println(stt + " " + name + " " + congTy);
    }
}
