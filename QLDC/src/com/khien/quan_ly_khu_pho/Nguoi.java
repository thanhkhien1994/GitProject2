package com.khien.quan_ly_khu_pho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String ngheNghiep;

    public Nguoi() {
    }

    public void nhapThongTinNguoi(Scanner sc) {
        System.out.print("Nhập họ tên đầy đủ: ");
        hoTen = sc.nextLine();
        sc .nextLine();
        System.out.print("Nhập ngày sinh: dd-mm-yyyy");
        String strDate = sc.nextLine();
        ngaySinh = strToDate(strDate);
        System.out.println("Nhập vào nghề nghiệp");
        ngheNghiep = sc.nextLine();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);

        } catch (ParseException e) {
            System.out.println("Lối định dạng ngày tháng!");
        }
        return date;
    }

    public void hienThiThongTinNguoi() {
        System.out.println(
                        "Họ tên: " + hoTen + "\n" +
                        "Ngày sinh: " + dateToString(ngaySinh) + "\n" +
                        "Nghề nghiệp: " + ngheNghiep + "\n"
        );
    }

    private String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        String strDate = sdf.format(date);
        return strDate;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }
}
