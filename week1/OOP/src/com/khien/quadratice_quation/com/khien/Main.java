package com.khien.quadratice_quation.com.khien;

import com.khien.quadratice_quation.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c :");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDenta();

        if (delta == 0) {
            System.out.println("the equation  has one root: " + quadraticEquation.getNgKep());
        } else if (delta >= 0) {
            System.out.println("the equation has two roots is: " + quadraticEquation.getNg1() + " and " + quadraticEquation.getNg2());
        } else {
            System.out.println("the equation has no real roots");
        }
        System.out.println(delta);
    }
}
