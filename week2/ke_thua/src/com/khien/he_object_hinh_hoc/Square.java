package com.khien.he_object_hinh_hoc;

public class Square extends Rectangle {
    public Square(){
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }
    @Override
    public String toString(){
        return "Hình vuông có độ dài cạnh là: "+getSide()+", đó là một lớp con của "+super.toString();
    }
}
