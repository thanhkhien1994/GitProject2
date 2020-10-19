package com.khien.he_object_hinh_hoc;
public class Circle extends Shape {

    private double radius = 1.0;

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override // ghi đè
    public String toString() {
        return "Hình tròn có bán kính là = " + getRadius() + " đó là lớp con của " + super.toString();
    }
}
