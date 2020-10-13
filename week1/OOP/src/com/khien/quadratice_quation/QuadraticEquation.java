package com.khien.quadratice_quation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDenta() {
        return (Math.pow(b, 2) - (4 * this.a * this.getC()));
    }
     public double getNgKep(){
        return (-b/(2*a));
     }
     public double getNg1(){
        return (-b+Math.sqrt(getDenta())/(2*a));
     }
    public double getNg2(){
        return (-b-Math.sqrt(getDenta())/(2*a));
    }
}
