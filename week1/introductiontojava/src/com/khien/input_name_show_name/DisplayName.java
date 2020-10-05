package com.khien.input_name_show_name;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
