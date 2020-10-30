package com.khien.quan_ly_nhan_vien;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB qlcb = new QLCB();
        qlcb.nhapDanhSach(sc);

        System.out.println("Nhập vào họ tên cần tìm kiếm: ");
        String name = sc.nextLine();

        qlcb.timKiemCanBo(name);
        sc.close();
    }
}
