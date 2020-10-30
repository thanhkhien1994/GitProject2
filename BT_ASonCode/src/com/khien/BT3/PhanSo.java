package com.khien.BT3;

import java.util.Scanner;

//Đề Thi Thực Hành 8:
//        : Xây dựng lớp phân số với hai thuộc tính riêng xác định tử số và mẫu số của phân số và xây dựng các phương thức:
//        Các hàm khởi tạo (constructor) trong trường hợp không có tham số và trường hợp có 2 tham số tử số và mẫu số
//        Các hàm thực hiện phép toán cộng, trừ, nhân, chia các phân số
//        Hàm thực hiện kiểm tra một phân số có phải tối giản hay không
//        Hàm tìm tìm dạng tối giản của phân số
//        Hàm tìm ước số chung lớn nhất của 2 số nguyên.
//        Viết chương trình ứng dụng, trong đó khai báo 3 đối số phân số là sp1, sp2 và spTong để tương tác với các hàm có trong lớp phân số trên.
public class PhanSo {
    private double tuSo;
    private double mauSo;
    private double ucln;

    public PhanSo() {

    }

    public PhanSo(double tuSo, double mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public double getTuSo() {
        return tuSo;
    }

    public void setTuSo(double tuSo) {
        this.tuSo = tuSo;
    }

    public double getMauSo() {
        return mauSo;
    }

    public void setMauSo(double mauSo) {
        this.mauSo = mauSo;
    }

    public String toString() {
        return "Ta có phân số sau: " + this.tuSo + "/" + this.mauSo;
    }
}
