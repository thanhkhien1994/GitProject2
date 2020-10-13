package khien.com.sohoanhao;

import java.util.Scanner;

public class SoHoanHao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");

            int sum = 0, number = input.nextInt();

            for (int i = 1; i <= number / 2; i++) {

                if (number % i == 0) {
                    sum += i;
                }
            }
            if (check(number, sum))
                System.out.println("true");
            else System.out.println("false");
            if (number == 0) break;
        }


    }

    public static boolean check (int number, int sum){
        return number == sum;
    }

}
