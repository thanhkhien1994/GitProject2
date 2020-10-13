package khien.com.sao_menu;

import java.util.Scanner;

public class StarMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. ve ngoi sao 5 canh");
        System.out.println("2. ve ngoi sao quoc ky VN");
        System.out.println("3. ve ngoi sao quoc ky US");
        System.out.println("4. ve ngoi sao hcn");
        System.out.println("5. ve ngoi sao hinh vuong");
        System.out.println("0. exit");

        while (true){
            int choice;
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("   *     *");
                    System.out.println("   *** ***");
                    System.out.println("   *******");
                    System.out.println("  ********");
                    System.out.println("***********");
                    System.out.println("    *********");
                    System.out.println("    ***");
                    System.out.println("     *");
                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.println("-------*-----*-------");
                    System.out.println("-------***-***-------");
                    System.out.println("-------*******-------");
                    System.out.println("------********-------");
                    System.out.println("----***********------");
                    System.out.println("--------*********----");
                    System.out.println("--------***----------");
                    System.out.println("---------*-----------");
                    System.out.println("---------------------");
                    break;
                case 3:
                    System.out.println("* * * *------------");
                    System.out.println("* * * *------------");
                    System.out.println("* * * *------------");
                    System.out.println("* * * *------------");
                    System.out.println("-------------------");
                    System.out.println("-------------------");
                    System.out.println("-------------------");
                    break;
                case 4:
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    break;
                case 5:
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 0: System.exit(0);
            }
        }
    }
}
