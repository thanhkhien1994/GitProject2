package com.khien._stack;

public class GenericStackClient {
    public static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Khiên");
        stack.push("Linh");
        stack.push("Nghĩa");
        stack.push("Hải");
        stack.push("Thọ");
        stack.push("Hòa");
        System.out.println("1.1 Kích thước của ngăn xếp sau khi được đẩy "+stack.size());
        System.out.println("1.2 Lấy element từ stack: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println("");
        System.out.println("1.3Kích thước của ngăn xếp sau khi được lấy ra hết "+stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(8);
        stack.push(2);
        stack.push(0);
        System.out.println("2.1 Kích thước của ngăn xếp sau khi được đẩy "+stack.size());
        System.out.println("2.2 Lấy element từ stack: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println("");
        System.out.println("2.3 Kích thước của ngăn xếp sau khi được lấy ra hết "+stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of string");
        stackOfStrings();
        System.out.println("2. Stack of integer");
        stackOfIntegers();
    }
}
