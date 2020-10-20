package com.khien.point2d_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] result = {super.getX(), super.getY(), z};
        return result;
    }

    @Override
    public String toString() {
        return "("+ getXYZ()[0] +","+getXYZ()[1]+","+z+")";
    }
}
