package com.khien.cylindervolumecalculator;

public class Circle {
    String color;
    private double radius;

    public Circle(String color, double radius){
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*2*getRadius();
    }

    @Override
    public String toString() {
        return "Lớp hình tròn có màu là: "+getColor()+", và bán kính là: "+ getRadius() +"\n"
                + "Diện hình tròn tích là: "+ getArea();
    }
}
