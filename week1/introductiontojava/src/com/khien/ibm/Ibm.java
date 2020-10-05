package com.khien.ibm;

import java.util.Scanner;

public class Ibm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitNow = true;
        double weight, height, bmi;

        while (exitNow) {
            System.out.println("Input width: ");
            weight = scanner.nextDouble();
            System.out.println("Input height: ");
            height = scanner.nextDouble();

            if (weight > 0 && height > 0) {
                bmi = weight / (height * height);
                if (bmi > 0 && bmi < 18.5) {
                    System.out.println("Under Width");
                } else if (bmi >= 18.5 && bmi <= 25) {
                    System.out.println("Normal");
                } else if (bmi > 25 && bmi <= 30) {
                    System.out.println("Over Weight");
                } else if (bmi > 30) {
                    System.out.println("Obese");
                } else System.out.println("Not Syntax number");
            } else System.out.println("number not syntax");

            System.out.println("You want continue sure!, input 1: continue, input 0: exit now");
            int checkExit = scanner.nextInt();
            if (checkExit == 1) {
                continue;
            } else break;

        }

    }

}
