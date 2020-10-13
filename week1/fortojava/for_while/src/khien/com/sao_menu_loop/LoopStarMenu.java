package khien.com.sao_menu_loop;

import java.util.Scanner;

public class LoopStarMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print the isosceles triangle");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = i; j > 0; j--) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for (int i = 7; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 1:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.exit(4);

                    default:
                        System.out.println("fail");
        }

        }
    }
}
