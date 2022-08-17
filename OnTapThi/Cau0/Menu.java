/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTapThi.Cau0;

/**
 *
 * @author pc asus
 */
public class Menu {
    public static int userChoice()
    {
        int choice;
        System.out.println("Press 1: Create List");
        System.out.println("Press 2: Display List");
        System.out.println("Press 3: Remove Student");
        System.out.println("Press 4: Update Student");
        System.out.println("Press 5: Exit");
        System.out.print("Enter user choice: ");
        choice = Main.in.nextInt();
        return  choice;
    }


}
