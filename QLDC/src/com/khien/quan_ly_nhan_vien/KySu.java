package com.khien.quan_ly_nhan_vien;

import java.util.Scanner;

public class KySu extends CanBo {
    //thuộc tính
    private String nganhDaoTao;

    //Phương thức
    //Hàm khởi tạo
    public KySu() {
    }

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    //Hàm nhập
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập ngành đào tạo: ");
        nganhDaoTao = sc.nextLine();
    }
    //Hàm hiển thị thông tin

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgành đào tạo: " + nganhDaoTao);
    }
}
