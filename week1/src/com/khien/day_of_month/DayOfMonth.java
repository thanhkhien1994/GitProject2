package com.khien.day_of_month;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count day");
        int month = scanner.nextInt();

        boolean exitNow = true;

        while (exitNow) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("The month " + month + " has 31 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("The month " + month + " has 30 days");
                    break;
                case 2:
                    System.out.println("The month " + month + " has 29 or 30 days");
                    break;
                default:
                    System.out.println("Not has is month");
            }

            System.out.println("You want to continue ? input 1: continue, input 0: exit");
            int checkExit = scanner.nextInt();

            if (checkExit == 1) {
                System.out.println("Which month that you want to count day");
                month = scanner.nextInt();
            } else if (checkExit == 0) {
                break;
            }
        }

    }
}
