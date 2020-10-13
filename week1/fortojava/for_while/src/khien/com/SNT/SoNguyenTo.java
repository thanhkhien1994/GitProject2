package khien.com.SNT;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;

        for (int i = 2; count < number ; i++) {
            if (check(i)){
                System.out.println(i + " ");
            }
            count ++;
        }

    }
    public static boolean check(int num){
        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return  true;

    }
}