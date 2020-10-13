package khien.com.seach_students_list;

import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public interface ListStudentSeach {
    public static void main(String[] args) {
        String[] arrStudents = {"Khien", "Dung", "Thien", "Dia", "Hoi", "Nghi", "Son", "Dang", "Tung", "Van", "Nghia"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name's Students: ");
        String nameStudent = sc.nextLine();

        boolean isExit = false;
        for (int i = 0; i < arrStudents.length; i++) {
            if (arrStudents[i].equals(nameStudent)) {
                System.out.println("Position of student in the list " + nameStudent + " is: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found '" + nameStudent + "' in the list.");
    }
}
