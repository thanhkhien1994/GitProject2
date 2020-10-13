package com.khien.people;

public class People {
    private float height;
    private float weight;
    private String sex;

    public People() {
    }

    public People(float height, float weight, String sex) {
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "height=" + height +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
