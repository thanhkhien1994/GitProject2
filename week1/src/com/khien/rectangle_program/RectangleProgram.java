package com.khien.rectangle_program;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width, height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width = scanner.nextFloat();

        System.out.println("Enter Height: ");
        height = scanner.nextFloat();


        float area = width * height;
        System.out.println("Area is: " + area);
    }

}
