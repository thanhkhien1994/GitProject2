package com.codegym.staticMethod;

public class StudentTest {
    public static void main(String[] args) {


        Student s1 = new Student(1, "Hoang");
        Student s2 = new Student(2, "Khanh");
        Student s3 = new Student(3, "Nam");
        Student.change();

        s1.display();
        s2.display();
        s3.display();
    }
}
