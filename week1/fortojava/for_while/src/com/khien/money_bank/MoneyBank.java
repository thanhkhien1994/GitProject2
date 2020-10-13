package com.khien.money_bank;

import java.util.Scanner;

public class MoneyBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number money: ");
        double money = input.nextDouble();

        System.out.println("Enter a number interest: ");
        double interest = input.nextDouble();

        System.out.println("Enter a number Month");
        double month = input.nextDouble();


        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interest/100)/12*month;
        }
        System.out.println("Money of you are: " +(total+money));
    }
}
