package com.khien.BT1;

import java.util.Scanner;

public class Program {
    //Chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Program.msg_capacity();
        int capacity = scanner.nextInt();

        ArraySimple arraySimple = null;
        arraySimple = new ArraySimple(capacity);

        while (true) {
            System.out.println("Nhập vào số nguyên tại vị trí " + Function.count);
            int input = scanner.nextInt();
            arraySimple.add(input);

            if (capacity == Function.count) {
                System.out.println("Danh sách số nguyên trong mảng: ");
                for (int i = 0; i < arraySimple.getSize() - 1; i++) {
                    System.out.print((arraySimple.ints[i] + ", "));
                }
                System.out.println(arraySimple.ints[capacity - 1]);
                break;
            }
            Function.count++;
        }
        Program.init(arraySimple);
    }

    //Hàm khởi tạo
    public static void init(ArraySimple arraySimple) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            Program.menu();
            int select = scanner.nextInt();
            switch (select) {
                case 1://Hiển thị List
                    Function.showList(arraySimple);
                    break;
                case 2://Kiểm tra số trùng lặp.
                    Function.checkSame(arraySimple);
                    break;
                case 3://Kiểm tra số âm trong danh sách
                    Function.negative(arraySimple);
                    break;
                case 4://tính trung bình cộng
                    Function.average(arraySimple);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không đúng");
            }
        }
        while (!exit);
    }

    //Hàm hiển thị danh sách
    public static void menu() {
        System.out.println("-----------------------------------------\n"+
                "Lựa chọn\n" +
                "1.Hiển thị danh sách số nguyên\n" +
                "2.Kiểm tra số trùng lặp\n" +
                "3.Kiểm tra số âm trong danh sách\n" +
                "4.Tính trung bình cộng của các số nguyên trong danh sách\n" +
                "0.Thoát chương trình\n" +
                "----------------------------------------------"
        );
    }

    public static void msg_capacity() {
        System.out.println("Bạn muốn danh sách có bao nhiêu số nguyên: ");
    }
}
