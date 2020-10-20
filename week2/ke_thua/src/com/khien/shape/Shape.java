package com.khien.shape;

public class Shape {
    private double d = 1.0;
    private double r = 1.0;

    public Shape(double x, double y){
        this.d = x;
        this.r = y;
    }
    public Shape(){}

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
