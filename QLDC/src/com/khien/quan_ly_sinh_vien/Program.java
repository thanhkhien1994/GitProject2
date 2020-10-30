package com.khien.quan_ly_sinh_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function function = new Function();

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        choice(function, scanner, teachers, students);

    }
    public static void choice(Function function, Scanner scanner, ArrayList<Teacher> teachers, ArrayList<Student> students){
        int choice;
        Student student;
        Teacher teacher;
        do {
            function.menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    student = new Student();
                    student.setInfoStudent(scanner);
                    students.add(student);
                    break;
                case 2:
                    teacher = new Teacher();
                    teacher.setTeacherInfo(scanner);
                    teachers.add(teacher);
                    break;
                case 3:
                    function.search(scanner, students, teachers);
                    break;
                case 4:
                    function.show(scanner, students, teachers);
                    break;
                case 5:
                    function.edit(students, teachers, scanner);
                default:
            }
        } while (choice != 6);
    }
}