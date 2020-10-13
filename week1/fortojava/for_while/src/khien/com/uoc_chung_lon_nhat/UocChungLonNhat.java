package khien.com.uoc_chung_lon_nhat;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        int i = 0;
        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a: ");
            a = input.nextInt();
            System.out.println("Enter b: ");
            b = input.nextInt();

            a = Math.abs(a);
            b = Math.abs(b);

            if (a == 0 || b == 0)
                System.out.println("No greatest common factor ");

            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            i++;
            System.out.println("Greatest common factor: " + a);
            if (i == 2) break;
        }
    }
}
