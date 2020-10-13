package com.khien.min_arr;

import java.util.Scanner;

public class MinArr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao do dai mang: ");
        int size;
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Nhap vao gia tri "+ (i+1)+": ");
           arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Min is: " + min);


    }
}
