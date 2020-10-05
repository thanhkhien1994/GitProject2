package com.khien.linear_equation_resolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        int exitNow;
        do {
            System.out.println("Tim phuong trinh bac nhat");
            System.out.println("Phuong trinh co dang ax + b = 0, vui long nhap vao a, b");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhap vao a: ");
            double a = scanner.nextDouble();

            while (a==0){
                System.out.println("Moi nhap lai");
                System.out.println("Nhap vao a: ");
                a = scanner.nextDouble();
            }

            System.out.println("Nhap vao b: ");
            double b = scanner.nextDouble();

            if (b == 0){
                System.out.println("Phuong trinh co vo so nghiem x");
            }else  {
                double answer = (- b) / a;
                System.out.println("Ket qua la: " + answer);
            }


            System.out.println("nhan 1 de tiep tuc, nhan 0 de ket thuc");
            exitNow = scanner.nextInt();
        } while (exitNow == 1);

    }
}
