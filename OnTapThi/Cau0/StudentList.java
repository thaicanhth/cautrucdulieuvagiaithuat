/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTapThi.Cau0;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc asus
 */

public class StudentList {

    private List<Student> students = new ArrayList<>();

    public StudentList() {
        Student stu01 = new Student("111", "A Nguyen", 8.5);
        Student stu02 = new Student("222", "B Nguyen", 7.5);
        Student stu03 = new Student("333", "C Nguyen", 6.5);
        Student stu04 = new Student("444", "D Nguyen", 5.5);
        students.add(stu01);
        students.add(stu02);
        students.add(stu03);
        students.add(stu04);
    }

    public void create() {
        String i;
        String f;
        double g;

        System.out.print("Enter Id= ");
        i = Main.in.nextLine();
        System.out.print("Enter Name = ");
        f = Main.in.nextLine();
        System.out.print("Enter grade = ");
        g = Main.in.nextDouble();
        Student tmp = new Student(i, f, g);
        students.add(tmp);
//        return tmp;
    }

    public void display() {
        for (Student stuPointer : students) {
            System.out.println("" + stuPointer);
        }
    }

    public void remove() {
        System.out.println("Enter index to remove: ");
        int index = Main.in.nextInt();
        if (index < students.size()) {
            System.out.println("Ok, we will remove the " + index + " student");
            students.remove(index);
            display();
        }
    }

    public void update() {
        System.out.println("Enter index to update: ");
        int index = Main.in.nextInt();
        if (index < students.size()) {
            System.out.println("Ok, we will UPDATE the " + index + " student");

            String i;
            String f;
            double g;
            Main.in.nextLine();

            System.out.print("Enter Id= ");
            i = Main.in.nextLine();
            System.out.print("Enter Name = ");
            f = Main.in.nextLine();
            System.out.print("Enter grade = ");
            g = Main.in.nextDouble();
            Student tmp = new Student(i, f, g);
            students.set(index, tmp);
            display();
        }
    }

}