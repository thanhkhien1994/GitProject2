package com.khien.quan_ly_sinh_vien;

import java.util.Scanner;

public class StudentNext extends Student {
    private String chucVu;
    private int luong;
    private int soLuongMonHocLai;
    private int numberMoneyed;
    Student student;

    public StudentNext() {
        student = new Student();
    }

    public StudentNext(int ID, String email, int phoneNumber, int studentID, String course, String specialized, String classification, String chucVu, int luong, int soLuongMonHocLai, int numberMoneyed) {
        super(ID, email, phoneNumber, studentID, course, specialized, classification);
        this.chucVu = chucVu;
        this.luong = luong;
        this.soLuongMonHocLai = soLuongMonHocLai;
        this.numberMoneyed = numberMoneyed;
    }

    @Override
    public void setInfoStudent(Scanner scanner) {
        super.setInfoStudent(scanner);
        System.out.println("Nhập vào chức vụ: ");
        chucVu = scanner.nextLine();
        System.out.println("Nhập vào lương: ");
        luong = scanner.nextInt();
        System.out.println("Nhập vào số lượng môn học học lại: ");
        soLuongMonHocLai = scanner.nextInt();
        System.out.println("Nhập vào tổng học phí: ");
        numberMoneyed = scanner.nextInt();
    }


    public void show() {
        System.out.println("Thông tin sinh viên đã tốt nghiệp");
        super.displayStudentInfo();
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Lương: " + luong);
        System.out.println("Số lượng môn học lại: " + soLuongMonHocLai);
        System.out.println("Tiêng lương hiện tại: " + numberMoneyed);
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getSoLuongMonHocLai() {
        return soLuongMonHocLai;
    }

    public void setSoLuongMonHocLai(int soLuongMonHocLai) {
        this.soLuongMonHocLai = soLuongMonHocLai;
    }

    public int getNumberMoneyed() {
        return numberMoneyed;
    }

    public void setNumberMoneyed(int numberMoneyed) {
        this.numberMoneyed = numberMoneyed;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

