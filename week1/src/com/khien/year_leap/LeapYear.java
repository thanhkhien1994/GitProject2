package com.khien.year_leap;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exitNow = true;
        while (exitNow){
            System.out.println("Input number of Year is you want search have leap Year sure ?");
            int year = scanner.nextInt();

            if(year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        System.out.println(year+ " is a leap Year");
                    } else System.out.println(year+ " is NOT a leap Year");
                } else System.out.println(year+ " is a leap Year");
            } else System.out.println(year+ " is NOT a leap Year");

            System.out.println("You want continue sure, input 1: continue, input 0: exit now!");
            int checkExit = scanner.nextInt();
            if(checkExit == 1){
                continue;
            } else {
                System.out.println("Good bey");
                break;
            }
        }
    }
}
