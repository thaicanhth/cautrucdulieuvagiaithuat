package bangbam;

import java.util.Hashtable;

public class OrderList {
    //bang bam
    private Hashtable<Customer, FruitList> mySales = new Hashtable<>();

    public OrderList() {
        Customer customer = new Customer(111, "Canh", "QN");
        FruitList fruitList = new FruitList();
        fruitList.putFruiTolist("Pear");
        fruitList.putFruiTolist("Mango");
//        System.out.println(""+customer);
//        fruitList.displayAll();
        mySales.put(customer, fruitList);
        Customer custome02 = new Customer(222, "Tran", "QN");
        FruitList fruitList02 = new FruitList();
        fruitList02.putFruiTolist("Orange");
        fruitList02.putFruiTolist("Watermelon");
        mySales.put(custome02, fruitList02);
    }

    public void putOrderList(Customer cus, FruitList fruit) {
        mySales.put(cus, fruit);
        System.out.println("Already put the new order to the system");
    }

    public void displayOrderList() {
        for (Customer key : mySales.keySet()) {
            FruitList value = mySales.get(key);
            System.out.println(key + "- BUY -" + value);
        }
    }
}

