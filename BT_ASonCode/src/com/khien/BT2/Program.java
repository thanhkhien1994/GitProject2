package com.khien.BT2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function function = new Function();
        Students student = new Students();
        int n = 0;

        do {
            System.out.println("Chọn chức năng");
            System.out.println("1: Thêm");
            System.out.println("2: Sửa ");
            System.out.println("3: Xóa");
            System.out.println("4: Hiển thị");
            System.out.println("5: Thoát");
            try {
                n = Integer.parseInt(sc.nextLine());
                switch (n) {
                    case 1:
                        function.addInfo(student);
                        break;
                    case 2:
                        function.editName();
                        break;
                    case 3:
                        function.delete();
                        break;
                    case 4:
                        function.showListStudents();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại");
            }
        } while (n != 5);
    }
}
