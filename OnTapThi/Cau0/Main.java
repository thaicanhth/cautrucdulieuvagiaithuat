/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTapThi.Cau0;

import java.util.Scanner;

/**
 *
 * @author pc asus
 */
public class Main {

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int ch;
        StudentList studentList = new StudentList();
        while (true) {
            ch = Menu.userChoice();
            in.nextLine();
            switch (ch) {
                case 6:
                    studentList.create();

                    break;
                case 2:
                    studentList.display();
                    break;
                case 3:
                    studentList.remove();
                    break;
                case 4:
                    studentList.update();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }

    }
    
}
