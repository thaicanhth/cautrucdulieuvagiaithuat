package buoi8;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> myStudents = new TreeSet<>();
        Student student1 = new Student("Cong", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Hanh", 19, "Danang");
        myStudents.add(student1);
        myStudents.add(student2);
        myStudents.add(student3);
        myStudents.add(student4);
        for (Student stu : myStudents) {
            System.out.println(""+stu.toString());
        }
    }
}
