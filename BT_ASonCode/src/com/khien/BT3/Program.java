package com.khien.BT3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function function = new Function();
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice){
                case 1: //Tối giản phân số
                    System.out.println("Tối giản phân số: ");
                    inputPhanSo1(phanSo1, scanner);
                    double ucln = function.ucln(phanSo1);
                    System.out.println(function.toiGianPhanSo(phanSo1, ucln));
                    break;
                case 2:    //Kiểm tra số tối giản
                    System.out.println("Kiểm tra số tối giản: ");
                    inputPhanSo1(phanSo1, scanner);
                    System.out.println(function.ktSoToiGian(phanSo1));
                    break;
                case 3:
                    System.out.println("Cộng 2 phân số: \nNhập vào phân số thứ nhất: ");
                    inputPhanSo1(phanSo1, scanner);
                    System.out.println("Nhập vào số thứ 2: ");
                    inputPhanSo2(phanSo2, scanner);
                    System.out.println(function.cong(phanSo1, phanSo2));

                    break;
                case 4:
                    System.out.println("Trừ 2 phân số: \nNhập vào phân số thứ nhất: ");
                    inputPhanSo1(phanSo1, scanner);
                    System.out.println("Nhập vào số thứ 2: ");
                    inputPhanSo2(phanSo2, scanner);
                    System.out.println( function.tru(phanSo1, phanSo2));

                    break;
                case 5:
                    System.out.println("Nhân 2 phân số: \nNhập vào phân số thứ nhất: ");
                    inputPhanSo1(phanSo1, scanner);
                    System.out.println("Nhập vào số thứ 2: ");
                    inputPhanSo2(phanSo2, scanner);
                    System.out.println(function.nhan(phanSo1, phanSo2));
                    break;
                case 6:
                    System.out.println("Chia 2 phân số: \nNhập vào phân số thứ nhất: ");
                    inputPhanSo1(phanSo1, scanner);
                    System.out.println("Nhập vào số thứ 2: ");
                    inputPhanSo2(phanSo2, scanner);
                    System.out.println( function.chia(phanSo1, phanSo2));
                    break;
                case 7:
                    System.out.println("Tìm ước chung lớn nhất: ");
                    phanSo1 = new PhanSo();
                    inputPhanSo1(phanSo1, scanner);
                    System.out.println("\tƯớc chung lớn nhất là: "+ function.ucln(phanSo1));
            }

        }while (choice != 8);
    }

    public static void menu(){
        System.out.print(
                "Lựa chọn\n" +
                        "\t1. Tối giản phân số\n" +
                        "\t2. Kiểm tra số tối giản\n" +
                        "\t3. Cộng phân số\n" +
                        "\t4. Trừ phân số\n" +
                        "\t5. Nhân phân số\n" +
                        "\t6. Chia phân số\n" +
                        "\t7. Tìm ước chung lớn nhất\n" +
                        "\t8. Thoát\n"
        );
    }

    public static void inputPhanSo1(PhanSo phanSo1, Scanner scanner){
        System.out.println("\tNhập vào tử số: ");
        phanSo1.setTuSo(scanner.nextDouble());
        System.out.println("\tNhập vào mẫu số: ");
        phanSo1.setMauSo(scanner.nextDouble());
    }

    public static void inputPhanSo2(PhanSo phanSo2, Scanner scanner){
        System.out.println("\tNhập vào tử số: ");
        phanSo2.setTuSo(scanner.nextDouble());
        System.out.println("\tNhập vào mẫu số: ");
        phanSo2.setMauSo(scanner.nextDouble());
    }
}
