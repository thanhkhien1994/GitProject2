package com.khien.he_object_hinh_hoc;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("blue", true);
//        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.0, "yeelow", true);
        System.out.println(circle);

    }
}
