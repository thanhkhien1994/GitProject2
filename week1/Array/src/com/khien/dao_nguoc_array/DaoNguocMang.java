package com.khien.dao_nguoc_array;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("size does not exceed 20");

        } while (size > 20);

        array = new int[size];

        for (int i =0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;

        }
        System.out.print("Elements in array: ");
        for (int x : array
        ) {
            System.out.print(x + " ");
        }
    }
}
