package com.khien.quan_ly_khu_pho;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHoDan;

    public KhuPho() {
        danhSachHoDan = new ArrayList<>();
    }

    public void themHoDan(HoDan hoDan) {
        danhSachHoDan.add(hoDan);
    }

    public void nhapDanhSach(Scanner sc) {
        HoDan hoDan;
        System.out.print("Nhập vào số hộ dân cần thêm: ");
        int soHoDan = sc.nextInt();
        System.out.print("Nhập vào thông tin cho từng hộ dân: ");

        for (int i = 0; i < soHoDan; i++) {
            System.out.println("Nhập vào hộ dân thứ " + (i + 1) + " là: ");
            hoDan = new HoDan();
            hoDan.nhapThongTinHoDan(sc);
            themHoDan(hoDan);
        }
    }

    public void hienThiDanhSach() {
        int n = danhSachHoDan.size();
        for (int i = 0; i < n; i++) {
            System.out.println("Hộ dân thứ " + (i + 1) + " là: ");
            danhSachHoDan.get(i).hienThiThongTin();

        }
    }

    public void timKiemThongTin() {
        Date now = new Date();
        int namHienTai = now.getYear() + 1990;

        Nguoi[] danhsachThanhVien = null;
        for (HoDan hoDan : danhSachHoDan) {
            danhsachThanhVien = hoDan.getList();
            for (int i = 0; i < hoDan.getSoNguoi(); i++) {
                if (namHienTai - (danhsachThanhVien[i].getNgaySinh().getYear() + 1990) == 80) {
                    hoDan.hienThiThongTin();
                }
            }
        }
    }
}
