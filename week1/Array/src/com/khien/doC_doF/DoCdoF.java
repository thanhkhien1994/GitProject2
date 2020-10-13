package com.khien.doC_doF;

import java.util.Scanner;

public class DoCdoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double f;
        double c;

        do {
            System.out.println("Choice of you: ");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("3. Exit");
            System.out.println("Enter to calculate");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("input F: ");
                    f = sc.nextDouble();
                    System.out.println("C: "+FtoC(f));
                    System.out.println("----------------");
                    break;
                case 2:
                    System.out.println("input C: ");
                    c = sc.nextDouble();
                    System.out.println("F: "+CtoF(c));
                    System.out.println("----------------");

                    break;
                case 3:
                    System.exit(3);


            }

        }while (choice !=0);






    }
    public static double CtoF(double c){
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double FtoC(double f){
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
