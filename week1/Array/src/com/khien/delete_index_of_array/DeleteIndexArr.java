package com.khien.delete_index_of_array;

import java.util.Scanner;

public class DeleteIndexArr {
    public static void main(String[] args) {
        int count = 1;
        int[] arrValue = {1,2,3,4,5,6,6,8,9};
        Scanner sc = new  Scanner(System.in);

        int x = 0;
        do {
            System.out.println("Enter the number to delete: ");
            x = Integer.parseInt(sc.nextLine());
            int c = 0;
            for (int i = 0; i <arrValue.length ; i++) {
                if (x != arrValue[i]){
                    arrValue[c] = arrValue[i];
                    c++;
                }else{
                    arrValue[arrValue.length-count] = 0;
                    count++;
                }
            }

            System.out.print("Array new: ");
            for (int a:arrValue
            ) {
                System.out.print(a+ " ");

            }
            System.out.println(" ");
        }while (x != 0);
    }
}