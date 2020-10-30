package com.khien.BT1;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
    protected static int count = 1;

    //Tính tổng số nguyên trong list
    protected static void sum(ArraySimple array) {
        int sum = (int) array.ints[0];
        for (int i = 1; i < array.ints.length; i++) {
            sum += (int) array.ints[i];
        }
        System.out.println(sum);
    }

    // Tính trung bình cộng của mảng số nguyên
    protected static void average(ArraySimple arraySimple) {
        int average = (int) arraySimple.ints[0];
        for (int i = 0; i < arraySimple.ints.length; i++) {
            average += (int) arraySimple.ints[i];
        }
        double result = (average/arraySimple.getSize());
        System.out.println(result);
    }

    // check số âm
    protected static void negative(ArraySimple arraySimple) {
        boolean isCheck = true;
        for (int i = 0; i < arraySimple.ints.length; i++) {
            if (Integer.parseInt(arraySimple.ints[i].toString()) < 0) {
                System.out.print(arraySimple.ints[i] + ", ");

                isCheck = false;
            }
        }
        if (isCheck) System.out.println("Không có số âm nhé.");
    }

    // check số giống nhau
    protected static void checkSame(ArraySimple arraySimple) {
        boolean isCheck = true;
        for (int i = 0; i < arraySimple.ints.length-1; i++) {
            for (int j = 1; j < arraySimple.ints.length; j++) {
                if (i != j) {
                    if (Integer.parseInt(arraySimple.ints[i].toString()) == Integer.parseInt(arraySimple.ints[j].toString())) {
                        System.out.println("Số tại vị trí thứ " + i + " bằng số tại vị trí thứ " + j + " là: " + arraySimple.ints[i]);
                        isCheck = false;
                    }
                }
            }
        }
        if (isCheck){
            System.out.println("Không có số trùng lặp");
            isCheck = false;
        }

    }
    protected static void showList(ArraySimple arraySimple){
        for (int i = 0; i <arraySimple.ints.length-1 ; i++) {
            System.out.print(arraySimple.ints[i]+", ");
        }
        System.out.println(arraySimple.ints[ArraySimple.getSize()-1]);
    }
}
