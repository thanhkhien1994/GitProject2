package com.khien.point_move_able_point;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(5,5);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(5,5,5,5);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
