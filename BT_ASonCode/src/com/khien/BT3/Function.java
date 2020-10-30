package com.khien.BT3;

import java.util.Scanner;

public class Function {

    public Function() {
    }

    // Ước chung lớn nhất
    public double ucln(PhanSo phanSo) {
        double a = phanSo.getTuSo();
        double b = phanSo.getMauSo();

        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        System.out.println("UCLN: " + a);
        return a;
    }

    //Phân số tối giản
    public String toiGianPhanSo(PhanSo phanSo, double ucln) {
        if (ucln != 0) {
            phanSo.setTuSo(phanSo.getTuSo() / ucln);
            phanSo.setMauSo(phanSo.getMauSo() / ucln);
        }
        return "Phân số đã tối giản là: "+ phanSo.getTuSo() + "/" + phanSo.getMauSo();
    }
    //Kiểm tra số tối giản
    public String ktSoToiGian(PhanSo phanSo) {
        if(ucln(phanSo) == 1){
            return  ("Số bạn nhập vào đã tối giản");
        } else  return ("Số bạn nhập vào chưa tối giản");
    }

    public double cong(PhanSo phanSo1, PhanSo phanSo2){
        double num1 = (phanSo1.getTuSo()/phanSo1.getMauSo());
        double num2 = (phanSo2.getTuSo()/phanSo2.getMauSo());
        return (num1+num2);
    }

    public double tru(PhanSo phanSo1, PhanSo phanSo2){
        double num1 = phanSo1.getTuSo()/phanSo1.getMauSo();
        double num2 = phanSo2.getTuSo()/phanSo2.getMauSo();
        return num1-num2;
    }

    public double nhan(PhanSo phanSo1, PhanSo phanSo2){
        double num1 = phanSo1.getTuSo()/phanSo1.getMauSo();
        double num2 = phanSo2.getTuSo()/phanSo2.getMauSo();
        return num1*num2;
    }

    public double chia(PhanSo phanSo1, PhanSo phanSo2){
        double num1 = phanSo1.getTuSo()/phanSo1.getMauSo();
        double num2 = phanSo2.getTuSo()/phanSo2.getMauSo();
        return num1/num2;
    }

}
