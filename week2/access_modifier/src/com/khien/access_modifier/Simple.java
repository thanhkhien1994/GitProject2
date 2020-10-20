package com.khien.access_modifier;

public class Simple {

    public static void main(String args[]) {

        A obj = new A();
        int result = obj.data;// để public truy cập trự tiếp vào trường đc rồi nè
        System.out.println(result);
        obj.msg();//để public truy cập trự tiếp vào thuộc tính đc rồi nè

    }
}
