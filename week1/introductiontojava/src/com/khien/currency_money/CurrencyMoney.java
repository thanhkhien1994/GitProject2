package com.khien.currency_money;

import java.util.Scanner;

public class CurrencyMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        boolean exit = true;
        while (exit){
            System.out.println("Input number money: ");
            double usd = scanner.nextDouble();

            double result = vnd * usd;
            System.out.println(result+" USD");
            System.out.println("Continue: input 1");
            int checkExit = scanner.nextInt();
            if (checkExit == 1){
                continue;
            }else break;
        }
    }
}
