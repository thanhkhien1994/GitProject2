package com.khien.number_leep;

import java.util.Scanner;

public class NumberLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number<2){
            System.out.println(number + " is not number leap");
        }else {
            int i = 2;
            boolean check = true;
            while (i<Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number+" is number leap");
            else System.out.println(number+" is not number leap");
        }

    }
}
