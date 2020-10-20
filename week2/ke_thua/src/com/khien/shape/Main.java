package com.khien.shape;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,5, 5);
        System.out.println("Diện tích là: "+triangle.S());
        triangle.setXYZ(10,10,10);
        System.out.println("Chu vi là: "+triangle.P());
    }
}
