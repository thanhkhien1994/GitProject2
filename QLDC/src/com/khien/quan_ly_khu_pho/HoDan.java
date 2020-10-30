package com.khien.quan_ly_khu_pho;

import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soNguoi;
    private int soNha;
    private Nguoi[] people;

    public HoDan() {
        people = new Nguoi[10];
    }

    public void nhapThongTinHoDan(Scanner sc) {
        System.out.println("Nhập vào số người: ");
        soNguoi = sc.nextInt();

        System.out.println("Nhập vào số nhà: ");
        soNha = sc.nextInt();

        System.out.println("Nhập thông tin cho từng người trong hộ: ");
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("người thứ " + (i + 1) + " là: ");
            people[i] = new Nguoi();
            people[i].nhapThongTinNguoi(sc);
        }
    }

    public void hienThiThongTin() {
        System.out.println("Số người: " + soNguoi);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Thông tin của từng người trong gia đình: ");
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("Người thứ " + (i + 1) + " là: ");
            people[i].hienThiThongTinNguoi();
        }
    }

    public Nguoi[] getList() {
        return people;
    }

    public int getSoNguoi() {
        return soNguoi;
    }
}
