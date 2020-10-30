package com.khien.quan_ly_sinh_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    //Menu chức năng
    public static void menu() {
        System.out.println("Lựa chọn ");
        System.out.println("1. Thêm mới sinh viên");
        System.out.println("2. Thêm mới giáo viên");
        System.out.println("3. Tìm kiếm");
        System.out.println("4. Hiển thị sinh viên");
        System.out.println("5. Sửa");
        System.out.println("6. Thoát");
    }

    //Hàm hiển thị thông tin
    public static void show(Scanner scanner, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        System.out.println("Lựa chọn ");
        System.out.println("1. Hiển thị tất cả sinh viên");
        System.out.println("2. Hiển thị tất cả giáo viên");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < students.size(); i++) {
                    students.get(i).displayStudentInfo();
                }
                break;
            case 2:
                for (Teacher teacher : teachers) {
                    teacher.showInfoTeacher();
                }
                break;
        }
    }

    //hàm tìm kiếm
    public static void search(Scanner scanner, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        System.out.println("Lựa chọn");
        System.out.println("1.Sinh viên");
        System.out.println("2.Giáo viên");
        int choice = scanner.nextInt();
        boolean check = false;
        switch (choice) {
            case 1:
                System.out.println("Nhập vào MSSV: ");
                int id1 = scanner.nextInt();
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentID() == id1) {
                        System.out.println("Thông tin tìm kiếm: ");
                        students.get(i).displayStudentInfo();
                        check = true;
                        break;
                    }
                    System.out.println("...");
                }
                if (!check) System.out.println("Không tìm thấy");
                break;
            case 2:
                System.out.println("Nhập vào MSGV: ");
                int id2 = scanner.nextInt();

                for (int i = 0; i < teachers.size(); i++) {
                    if (teachers.get(i).getTeacherID() == id2) {
                        System.out.println("Thông tin tìm kiếm: ");
                        teachers.get(i).showInfoTeacher();
                        check = true;
                        break;
                    }
                    System.out.println("...");
                }
                if (!check) System.out.println("Không tìm thấy");
                break;
            default:
                System.out.println("Không đúng!");
        }
    }

    //Hàm sửa
    public static void edit(ArrayList<Student> students, ArrayList<Teacher> teachers, Scanner scanner) {
        System.out.println("Nhập vào MSSV hoặc MSGV");
        int check = scanner.nextInt();
        if (teachers.size() > 0) {
            for (int i = 0; i < teachers.size(); i++) {
                if (teachers.get(i).getTeacherID() == check) {
                    System.out.println("Đã tìm thấy giảng viên: " + teachers.get(i).getName() + " Bạn có muốn sửa thông tin giảng viên này không!\n1. Có\n2. Không");
                    int isCheck = scanner.nextInt();
                    if (isCheck == 1) {
                        teachers.get(i).setTeacherInfo(scanner);
                        System.out.println("Đã thay đổi thông tin");
                        teachers.get(i).showInfoTeacher();
                    } else if (isCheck == 2) break;
                } else System.out.println("Không tìm thấy GV");
            }
        }
        if (students.size() > 0) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentID() == check) {
                    System.out.println("Đã tìm thấy sinh viên: " + teachers.get(i).getName() + " Bạn có muốn sửa thông tin sinh viên này không!\n1. Có\n2. Không");
                    int isCheck1 = scanner.nextInt();
                    if (isCheck1 == 1) {
                        students.get(i).setInfoStudent(scanner);
                        System.out.println("Đã thay đổi thông tin");
                        students.get(i).displayStudentInfo();
                    } else if (isCheck1 == 2) break;
                } else System.out.println("Không tìm thấy SV");
            }
        }

    }
}

