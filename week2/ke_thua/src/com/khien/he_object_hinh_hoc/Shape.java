package com.khien.he_object_hinh_hoc;

//Lớp Shape
public class Shape {

    private String color;
    private boolean filled;
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("màu xanh", true);
        System.out.println(shape);
    }

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //@Override
    public String toString() {
        return "Màu sắc " + getColor() + ", Tô bên trong = " + isFilled();
    }

}
