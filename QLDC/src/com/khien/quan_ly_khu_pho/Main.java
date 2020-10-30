package com.khien.quan_ly_khu_pho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhuPho quanLyKhuPho = new KhuPho();

        quanLyKhuPho.nhapDanhSach(scanner);
        System.out.println("Danh sách hộ dân có người mừng thọ 80 tuổi là: ");
        quanLyKhuPho.timKiemThongTin();
    }
}
