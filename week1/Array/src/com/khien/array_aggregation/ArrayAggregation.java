package com.khien.array_aggregation;

import java.util.Scanner;

public class ArrayAggregation {
    public static void main(String[] args) {
        int[] arrNum1;
        int[] arrNum2;
        int[] arrNum3;

        Scanner sc = new  Scanner(System.in);

        System.out.println("Nhap vao do dai mang 1");
        int size1 = sc.nextInt();
        arrNum1 = new int[size1];
        for (int i = 0; i <size1 ; i++) {
            System.out.println("Nhap gia tri "+(i+1)+" ");
            arrNum1[i] = sc.nextInt();
        }

        System.out.println("Nhap vao do dai mang 2");
        int size2 = sc.nextInt();
        arrNum2 = new int[size2];
        for (int i = 0; i <size2 ; i++) {
            System.out.println("Nhap vao gia tri "+(i+1)+" ");
            arrNum2[i] = sc.nextInt();
        }
        arrNum3 = new int[size1+size2];


        for (int i = 0; i < arrNum1.length ; i++) {
            int temp = arrNum1[i];
            arrNum3[i] = temp;
        }
        int counter = size2 -1;
        for (int i = size1; i < arrNum3.length ; i++) {
            int temp = arrNum2[counter];
            arrNum3[i] = temp;
            counter--;
        }


        for (int m:arrNum3
             ) {
            System.out.print(m +" ");
        }


    }
}