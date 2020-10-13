package khien.com.GTLN_Array;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        int size;
        int[] arrNum;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }

        } while (size > 20);

        arrNum = new int[size];
        int i = 0;
        while (i < arrNum.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arrNum[i] = sc.nextInt();
            i++;
        }

        int max = arrNum[0];
        for (int j = 0; j <arrNum.length ; j++) {
            if (max < arrNum[j]){
                max = arrNum[j];
            }
        }

        System.out.print("Property lists max is:  "+max);
    }
}
