package com.khien.point2d_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
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

    public float[] getXY(){
        float[] result = {x, y};
        return result;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
