package com.khien.he_object_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.0, "yeelow", true);
        System.out.println(circle);

        circle = new Circle(9.0, "indiago", false);
        System.out.println(circle);
    }
}