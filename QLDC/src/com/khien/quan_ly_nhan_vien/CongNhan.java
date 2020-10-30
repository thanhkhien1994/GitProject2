package com.khien.quan_ly_nhan_vien;

import java.util.Scanner;

public class CongNhan extends CanBo {
    //thuộc tính
    private String bac;
    //phương thức
    //hàm khởi tạo
    public CongNhan(){}
    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }
    //Hàm nhập
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\tNhập bậc: "); bac = sc.nextLine();
    }
    //hàm hiển thị thông tin
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tThông tin về bậc: "+bac);
    }
}
