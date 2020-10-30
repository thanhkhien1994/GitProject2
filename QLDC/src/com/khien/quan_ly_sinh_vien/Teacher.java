package com.khien.quan_ly_sinh_vien;

import java.util.Scanner;

public class Teacher extends Human {
    private int teacherID;
    private String specialize;// chuyên môn
    private int yearsOfExperience;//Kinh nghiệm
    private double salary;// lương
    private String mapWorld;//vị trí công tác
    private Human human;

    public Teacher(){
        human = new Human();
    }
    public Teacher(int ID, String email, int phoneNumber, int teacherID, String specialize, int yearsOfExperience, double salary, String mapWorld) {
        super(ID, email, phoneNumber);
        this.teacherID = teacherID;
        this.specialize = specialize;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.mapWorld = mapWorld;
    }

    public void setTeacherInfo (Scanner scanner){
        super.setHumanInfo(scanner);
        System.out.print("\tNhập vào MSGV: ");
        teacherID = scanner.nextInt();scanner.nextLine();
        System.out.print("\tNhập vào chuyên môn: ");
        specialize = scanner.nextLine();
        System.out.print("\tNhập vào số năm kinh nghiệm: ");
        yearsOfExperience = scanner.nextInt(); scanner.nextLine();
        System.out.print("\tNhập vào vị trí công tác: ");
        mapWorld = scanner.nextLine();
        System.out.print("\tNhập vào mức lương: ");
        salary = scanner.nextDouble();
    }

    public void showInfoTeacher(){
        System.out.println("Thông tin giảng viên");
        super.showInfoHuman();
        System.out.println("Giảng viên ID: "+teacherID);
        System.out.println("Chuyên môn: "+specialize);
        System.out.println("Thâm niên: "+yearsOfExperience);
        System.out.println("Vị trí: "+teacherID);
        System.out.println("Lương: "+salary);
        System.out.println("\n-------------------------------------------------");
    }
    public int getTeacherID(){
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMapWorld() {
        return mapWorld;
    }

    public void setMapWorld(String mapWorld) {
        this.mapWorld = mapWorld;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
