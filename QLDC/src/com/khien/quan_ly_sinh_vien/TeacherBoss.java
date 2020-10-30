package com.khien.quan_ly_sinh_vien;

import java.util.Scanner;

public class TeacherBoss extends Teacher {
    private String nhiemKy;
    private String thanhTich;
    Teacher teacher;
    public TeacherBoss(){
        teacher = new Teacher();
    }
    public TeacherBoss(String nhiemKy, String thanhTich) {
        this.nhiemKy = nhiemKy;
        this.thanhTich = thanhTich;
    }

    public TeacherBoss(int ID, String email, int phoneNumber, int teacherID, String specialize, int yearsOfExperience, double salary, String mapWorld, String nhiemKy, String thanhTich) {
        super(ID, email, phoneNumber, teacherID, specialize, yearsOfExperience, salary, mapWorld);
        this.nhiemKy = nhiemKy;
        this.thanhTich = thanhTich;
    }

    @Override
    public void showInfoTeacher() {
        super.showInfoTeacher();
        System.out.println("Nhiệm kỳ: "+nhiemKy);
        System.out.println("Thành tích: "+thanhTich);
    }

    @Override
    public void setTeacherInfo(Scanner scanner) {
        super.setTeacherInfo(scanner);
        System.out.println("Nhập vào nhiệm kỳ: ");
        nhiemKy = scanner.nextLine();
        System.out.println("Nhập vào thành tích: ");
        thanhTich = scanner.nextLine();
    }

    public String getNhiemKy() {
        return nhiemKy;
    }

    public void setNhiemKy(String nhiemKy) {
        this.nhiemKy = nhiemKy;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }
}
