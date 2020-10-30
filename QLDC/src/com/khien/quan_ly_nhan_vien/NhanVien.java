package com.khien.quan_ly_nhan_vien;

import java.util.Scanner;

public class NhanVien extends CanBo {
    //thuộc tính
    private String congViec;
    //Phương thức
    //Hàm khởi tạo
    public NhanVien(){}

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    //Hàm nhập thông tin
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Nhập công việc của nhân viên: "); congViec = sc.nextLine();
    }
    //Hàm hiển thị
    public void hienThiThongTin(){
        System.out.println("\t Công việc: "+congViec);
    }
}
