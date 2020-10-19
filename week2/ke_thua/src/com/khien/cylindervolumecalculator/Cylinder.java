package com.khien.cylindervolumecalculator;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return height * Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "Hình trụ này có chiều cao là: "+ getHeight()+"Bán kính là: "+ getRadius()+"\n"
                +"Thể tích là: "+getVolume();
    }
}
