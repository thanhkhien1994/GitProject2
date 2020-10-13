package com.khien.currency_money;

import java.util.Scanner;

public class CurrencyMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("Exit input: 0");
        while (true){
            System.out.println("Input number money: ");
            double usd = scanner.nextDouble();
            double result = vnd * usd;

            System.out.println(result+" USD");
            System.out.println("Exit input: 0");

            if (result == 0) break;
        }
    }
}
