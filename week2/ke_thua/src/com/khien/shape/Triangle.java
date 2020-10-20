package com.khien.shape;

public class Triangle extends Shape {
    private double z = 1.0;

    public Triangle() {
    }

    public Triangle(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public void setXYZ(double x, double y, double z){
        super.setD(x);
        super.setR(y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double S(){
        double h = Math.sqrt((super.getD()*super.getD()) - ((super.getD()/2)*(super.getD()/2)));
        double s = 0.5*super.getD()*h;
        return s;
    }

    public double P(){
        double result = getZ()+super.getD()+super.getR();
        return result;
    }
}
