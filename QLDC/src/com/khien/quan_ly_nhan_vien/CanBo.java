package com.khien.quan_ly_nhan_vien;

import java.util.Scanner;

public class CanBo {
    //Thuộc tính
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    // Phương thức
    //Hàm khởi tạo
    public CanBo() { }
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    //Hàm nhập
    public void nhapThongTin(Scanner sc){
        System.out.print("\tNhập vào họ tên cán bộ: "); hoTen = sc.nextLine();
        System.out.print("\tNhập vào ngày sinh(dd-mm-yyy): "); ngaySinh = sc.nextLine();
        System.out.print("\tNhập vào họ tên giới tính: "); gioiTinh = sc.nextLine();
        System.out.print("\tNhập vào họ tên địa chỉ: "); diaChi = sc.nextLine();
    }
    //Hàm hiển thị
    public void hienThiThongTin(){
        System.out.println("\tHọ tên: "+hoTen);
        System.out.println("\tNgày sinh: "+ngaySinh);
        System.out.println("\tGiới tính: "+gioiTinh);
        System.out.println("\tĐịa chỉ: "+diaChi);
    }
    //Lấy thông tin họ tên
    public String getHoTen(){
        return this.hoTen;
    }


}
