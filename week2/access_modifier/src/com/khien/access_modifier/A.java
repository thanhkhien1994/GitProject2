package com.khien.access_modifier;

public class A {
    protected String khien;
    public int data = 40;// nếu sử sụng private thì không thể truy cập ngoài class

    public void msg(){// nếu sử sụng private thì không thể truy cập ngoài class
        System.out.println("Hello java");
    }
}

