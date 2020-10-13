package com.khien.add_value_arr;

import java.util.Scanner;

public class AddElementArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter size is long array: ");
        size = Integer.parseInt(sc.nextLine());
        int[] arrNum = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arrNum[i] = sc.nextInt();
        }
        for (int b : arrNum
        ) {
            System.out.print("'" + b + "'," + " ");
        }
        System.out.println(" ");
        int x;
        int index;
        System.out.println("Enter index insert of array: ");
        index = sc.nextInt();

        if (index > size - 1 || index < 0) {
            System.out.println("Not insert because index fail!");
        } else {
            System.out.println("Enter Number insert: ");
            x = sc.nextInt();
            for (int i = arrNum.length - 1; i >= index; i--) {
                arrNum[i] = arrNum[i-1];
                if (i == index){
                    arrNum[index] = x;
                    break;
                }
            }
        }

        for ( int m: arrNum
             ) {
            System.out.print(m +" ");
        }

    }
}
