package com.khien.cylindervolumecalculator;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bán kính R: ");
        double radius = scanner.nextDouble();

        System.out.println("Nhập vào chiều cao: ");
        double height = scanner.nextDouble();

        System.out.println("Nhập vào mày sắc: ");
        String color = scanner.nextLine();

        Cylinder cylinder = new Cylinder(color, radius, height);
        System.out.println(cylinder);
    }
}
