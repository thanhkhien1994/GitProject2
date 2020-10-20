package com.khien.com.khien.point_move_able_point;

public class Point {
    private float x;
    private float y;

    public  Point(){

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y =y;
    }

    public float[] getXY(){
        float[] result = {x,y};
        return result;
    }

    @Override
    public String toString() {
        return "(" + x+","+y+")";
    }
}
