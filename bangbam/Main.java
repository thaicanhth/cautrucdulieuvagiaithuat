package bangbam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        OrderList ListOfSaleToday = new OrderList();
        ListOfSaleToday.displayOrderList();
        Customer c = new Customer();
        c= c.enterCustomer();
        FruitList F = new FruitList();
        ArrayList<String> myFruits= F.enterAllFruits(2);
        OrderList ol= new OrderList();
        ol.putOrderList(c, F);
        ol.displayOrderList();

    }
}
