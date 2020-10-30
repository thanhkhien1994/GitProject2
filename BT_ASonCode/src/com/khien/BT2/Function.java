package com.khien.BT2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Function {
    Scanner sc = new Scanner(System.in);
    ArrayList<Students> listStudent = new ArrayList<>();

    public void addInfo(Students student) {
        System.out.println("Nhập ID");
        int id = Integer.parseInt(sc.nextLine());
        student.setId(id);
        System.out.println("Nhập tên ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        student.setAddress(address);
        listStudent.add(student);
    }

    public void editName() {
        System.out.println("Nhập tên cần sửa ");
        String name = sc.nextLine();
        int n = 0;
        for (int i = 0; i < listStudent.size(); i++) {
            if (name.equals(listStudent.get(i).getName())) {
                System.out.println("Nhập tên mới");
                String nameNew = sc.nextLine();
                listStudent.get(i).setName(nameNew);
                n++;
                break;
            }
            if (n == 0) {
                System.out.println("Không tìm thấy");
            }

        }
    }

    public void delete() {
        System.out.println("Nhập tên cần xóa ");
        String name = sc.nextLine();
        int n = 0;
        for (int i = 0; i < listStudent.size(); i++) {
            if (name.equals(listStudent.get(i).getName())) {
                System.out.println("Tên đã xóa là " + listStudent.get(i).getName());
                listStudent.remove(listStudent.get(i));
                n++;
                break;
            }
        }
        if (n == 0) {
            System.out.println("Không có tên trong danh sách");
        }
    }
    public void showListStudents() {
        System.out.println("Danh sách học viên");
        for (Students s:listStudent) {
            System.out.println(s.toString());
        }
    }
}
