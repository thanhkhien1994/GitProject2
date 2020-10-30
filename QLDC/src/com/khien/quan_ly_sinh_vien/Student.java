package com.khien.quan_ly_sinh_vien;

import java.util.Scanner;

public class Student extends Human {
    private int studentID;
    private String course;
    private String specialized;
    private String classification;
    Human human;

    public Student (){
        human = new Human();
    }

    public Student(int ID, String email, int phoneNumber, int studentID, String course, String specialized, String classification) {
        super(ID, email, phoneNumber);
        this.studentID = studentID;
        this.course = course;
        this.specialized = specialized;
        this.classification = classification;
    }

    public void setInfoStudent(Scanner scanner){
        super.setHumanInfo(scanner);
        System.out.print("\tNhập vào MSSV: ");
        studentID = scanner.nextInt();scanner.nextLine();
        System.out.print("\tNhập vào Khóa học: ");
        course = scanner.nextLine();
        System.out.print("\tNhập vào chuyên ngành: ");
        specialized = scanner.nextLine();
        System.out.print("\tNhập vào xếp loại: ");
        classification = scanner.nextLine();
    }

    public void displayStudentInfo(){
        System.out.println("Thông tin sinh viên");
        super.showInfoHuman();
        System.out.println("Sinh viên ID: "+studentID);
        System.out.println("Khóa học: "+course);
        System.out.println("Chuyên ngành: "+specialized);
        System.out.println("Xếp loại: "+classification);
        System.out.println("\n-------------------------------------------------");
    }

    public int getStudentID(){
        return studentID;
    }
}
