package com.khien.quan_ly_nhan_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    //Thuộc tính
    private ArrayList<CanBo> danhSachCanBo;

    //Phương thức
    //hàm khởi tạo
    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    //hàm thêm cán bộ
    public void themCanBo(CanBo cb) {
        danhSachCanBo.add(cb);
    }

    //Hàm nhập danh sách
    public void nhapDanhSach(Scanner sc) {
        CanBo cb;
        System.out.println("Nhập vào số lượng cán bộ: ");
        int sl = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập thông tin chi tiết: ");
        for (int i = 0; i < sl; i++) {
            System.out.println("Lần nhập thứ " + (i + 1) + ": ");
            System.out.println("Chọn cán bộ (1-Kỹ sư; 2-Nhân viên; 3-Công nhân): ");
            int chon = sc.nextInt();
            sc.nextLine();

            cb = new CanBo();

            switch (chon) {
                case 1:
                    cb = new KySu();
                    break;
                case 2:
                    cb = new NhanVien();
                    break;
                case 3:
                    cb = new CongNhan();
                    break;
                default:
                    cb = new KySu();
                    break;
            }
            //sau khi  chọn loại cán bộ thì nhập thông tin cho cán bộ đó
            cb.nhapThongTin(sc);
            //Nhập xong rồi thì thêm cán bộ vào danh sách
            themCanBo(cb);
        }
    }

    //Hàm tìm kiếm theo tên
    public void timKiemCanBo(String hoTen) {
        for (CanBo cb : danhSachCanBo) {
            if (hoTen.equals(cb.getHoTen())) {
                cb.hienThiThongTin();
            }
        }
    }
}
